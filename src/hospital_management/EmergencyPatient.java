package hospital_management;

public class EmergencyPatient extends Patient {
    
    private String emergencyLevel; 
    private boolean ambulanceUsed;
    public EmergencyPatient(String patientId, String name, int age, String contactNumber, 
                           double treatmentCost, String emergencyLevel, boolean ambulanceUsed) {

        super(patientId, name, age, contactNumber, treatmentCost);
        this.emergencyLevel = emergencyLevel;
        this.ambulanceUsed = ambulanceUsed;
    }
     @Override
    public void receiveTreatment() {
        System.out.println("Emergency patient " + name + " receiving immediate emergency care in ER");
        System.out.println("Emergency Level: " + emergencyLevel);
        checkVitalSigns();
    }
    
    @Override
    public double calculateBill() {
        double totalBill = treatmentCost;
        
        // Emergency multiplier based on level
        if (emergencyLevel.equals("Critical")) {
            totalBill *= 2.0; 
        } else if (emergencyLevel.equals("High")) {
            totalBill *= 1.5;  
        } else {
            totalBill *= 1.2;  
        }
        
        // Add ambulance charges if used
        if (ambulanceUsed) {
            totalBill += 1500.0;  
        }
        
        return totalBill;
    }
    
    @Override
    public String getTreatmentType() {
        return "Emergency Treatment - " + emergencyLevel + " Priority";
    }
    
    // Emergency-specific method
    public void checkVitalSigns() {
        System.out.println("Checking vital signs: Blood pressure, heart rate, oxygen levels");
        System.out.println("Vital signs monitoring every 15 minutes");
    }
    
    // Getter methods for emergency-specific properties
    public String getEmergencyLevel() {
        return emergencyLevel;
    }
    
    public boolean isAmbulanceUsed() {
        return ambulanceUsed;
    }
    
    // Setter methods
    public void setEmergencyLevel(String emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }
    
    public void setAmbulanceUsed(boolean ambulanceUsed) {
        this.ambulanceUsed = ambulanceUsed;
    }
    public void displayEmergencyInfo() {
        displayBasicInfo(); 
        System.out.println("Emergency Level: " + emergencyLevel);
        System.out.println("Ambulance Used: " + (ambulanceUsed ? "Yes" : "No"));
        System.out.println("Treatment Type: " + getTreatmentType());
        System.out.println("Total Bill: ₹" + calculateBill());
    }
}