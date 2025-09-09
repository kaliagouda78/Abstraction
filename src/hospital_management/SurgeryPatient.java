package hospital_management;

public class SurgeryPatient extends Patient {
	private String surgeryType;
    private String surgeonName;
    private int surgeryDuration;     // in hours
    private boolean preOpCompleted;
    public SurgeryPatient(String patientId, String name, int age, String contactNumber, 
                         double treatmentCost, String surgeryType, String surgeonName, 
                         int surgeryDuration, boolean preOpCompleted) {
        super(patientId, name, age, contactNumber, treatmentCost);
        this.surgeryType = surgeryType;
        this.surgeonName = surgeonName;
        this.surgeryDuration = surgeryDuration;
        this.preOpCompleted = preOpCompleted;
    }
    @Override
    public void receiveTreatment() {
        System.out.println("Surgery patient " + name + " being prepared for " + surgeryType);
        System.out.println("Surgeon: " + surgeonName);
        System.out.println("Expected Duration: " + surgeryDuration + " hours");
        
        if (!preOpCompleted) {
            performPreOpCheckup();
        }
        
        System.out.println("Patient transferred to operation theater");
    }
    
    @Override
    public double calculateBill() {
        double totalBill = treatmentCost;  
        
        double surgeonFees = surgeryDuration * 15000.0;
        totalBill += surgeonFees;
        
        // Add anesthesia charges
        double anesthesiaCharges = surgeryDuration * 5000.0; 
        totalBill += anesthesiaCharges;
        
        double equipmentCharges = 25000.0;  
        totalBill += equipmentCharges;
        
        double postOpCharges = 2 * 3000.0; 
        totalBill += postOpCharges;
        
     
        if (surgeryType.toLowerCase().contains("heart") || 
            surgeryType.toLowerCase().contains("brain") || 
            surgeryType.toLowerCase().contains("spine")) {
            totalBill *= 1.5;
        }
        
        return totalBill;
    }
    
    @Override
    public String getTreatmentType() {
        return "Surgical Treatment - " + surgeryType + " (" + surgeryDuration + "hrs)";
    }

    public void performPreOpCheckup() {
        System.out.println("Performing pre-operative checkup for " + name);
        System.out.println("Blood tests, X-rays, and medical history review completed");
        System.out.println("Anesthesia consultation completed");
        System.out.println("Patient cleared for " + surgeryType);
        this.preOpCompleted = true;
    }

    public void startSurgery() {
        System.out.println("Surgery commenced: " + surgeryType);
        System.out.println("Lead Surgeon: " + surgeonName);
        System.out.println("Estimated time: " + surgeryDuration + " hours");
        System.out.println("Operation theater sterile and ready");
    }

    public void postOperativeCare() {
        System.out.println("Post-operative care initiated for " + name);
        System.out.println("Patient moved to recovery room");
        System.out.println("Vital signs monitoring every 30 minutes");
        System.out.println("Pain management protocol activated");
    }

    public void updateSurgeryStatus(String status) {
        System.out.println("Surgery status update for " + name + ": " + status);
        if (status.equalsIgnoreCase("completed")) {
            System.out.println(surgeryType + " completed successfully");
            postOperativeCare();
        }
    }
    

    public String getSurgeryType() {
        return surgeryType;
    }
    
    public String getSurgeonName() {
        return surgeonName;
    }
    
    public int getSurgeryDuration() {
        return surgeryDuration;
    }
    
    public boolean isPreOpCompleted() {
        return preOpCompleted;
    }
    

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }
    
    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName;
    }
    
    public void setSurgeryDuration(int surgeryDuration) {
        this.surgeryDuration = surgeryDuration;
    }
    
    public void setPreOpCompleted(boolean preOpCompleted) {
        this.preOpCompleted = preOpCompleted;
    }
    

    public void displaySurgeryInfo() {
    	super.displayBasicInfo();
        System.out.println("Surgery Type: " + surgeryType);
        System.out.println("Surgeon: " + surgeonName);
        System.out.println("Duration: " + surgeryDuration + " hours");
        System.out.println("Pre-op Completed: " + (preOpCompleted ? "Yes" : "No"));
        System.out.println("Treatment Type: " + getTreatmentType());
        System.out.println("Total Bill: ₹" + calculateBill());
    }
}