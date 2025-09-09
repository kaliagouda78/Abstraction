package hospital_management;

public class InPatient extends Patient {
    // Additional properties specific to InPatients
    private int numberOfDays;
    private String wardType;      // General/Private/ICU
    private String admissionDate;
    InPatient(String patientId, String name, int age, String contactNumber, 
                    double treatmentCost, int numberOfDays, String wardType, String admissionDate) {
       
        super(patientId, name, age, contactNumber, treatmentCost);
        this.numberOfDays = numberOfDays;
        this.wardType = wardType;
        this.admissionDate = admissionDate;
    }
   
    @Override
    public void receiveTreatment() {
        System.out.println("Inpatient " + name + " receiving continuous care in " + wardType + " ward");
        System.out.println("Admission Date: " + admissionDate);
        System.out.println("Number of Days: " + numberOfDays);
        assignBed();
    }
    
    @Override
    public double calculateBill() {
        double totalBill = treatmentCost;
        double dailyCharges = 0;
        switch (wardType.toLowerCase()) {
            case "general":
                dailyCharges = 800.0;
                break;
            case "private":
                dailyCharges = 2000.0;
                break;
            case "icu":
                dailyCharges = 5000.0;
                break;
            default:
                dailyCharges = 800.0;
        }
       totalBill += (dailyCharges * numberOfDays);
       totalBill += (numberOfDays * 500.0);//nurse
       totalBill += (numberOfDays * 300.0);  //food
        
        return totalBill;
    }
    
    @Override
    public String getTreatmentType() {
        return "Inpatient Care - " + wardType + " Ward (" + numberOfDays + " days)";
    }
    
    public void assignBed() {
        System.out.println("Bed assigned in " + wardType + " ward for " + name);
        System.out.println("Patient will be monitored 24/7 by nursing staff");
        
        if (wardType.equalsIgnoreCase("ICU")) {
            System.out.println("ICU monitoring equipment activated");
            System.out.println("Critical care protocols initiated");
        }
    }
    	public void dischargePatient() {
        System.out.println("Discharge process initiated for " + name);
        System.out.println("Total stay: " + numberOfDays + " days");
        System.out.println("Final bill amount: ₹" + calculateBill());
        System.out.println("Bed released in " + wardType + " ward");
    }
    	public void extendStay(int additionalDays) {
        this.numberOfDays += additionalDays;
        System.out.println("Stay extended by " + additionalDays + " days");
        System.out.println("New total stay: " + numberOfDays + " days");
    }
    	public int getNumberOfDays() {
        return numberOfDays;
    }
    
    public String getWardType() {
        return wardType;
    }
    
    public String getAdmissionDate() {
        return admissionDate;
    }
    
   
    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
    
    public void setWardType(String wardType) {
        this.wardType = wardType;
    }
    
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void displayInPatientInfo() {
        displayBasicInfo();
        System.out.println("Ward Type: " + wardType);
        System.out.println("Admission Date: " + admissionDate);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Treatment Type: " + getTreatmentType());
        System.out.println("Total Bill: ₹" + calculateBill());
    }
}