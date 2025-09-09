package hospital_management;

public abstract class Patient {
    protected String patientId;
    protected String name;
    protected int age;
    protected String contactNumber;
    protected double treatmentCost;
    	public Patient(String patientId, String name, int age, String contactNumber, double treatmentCost) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
        this.treatmentCost = treatmentCost;
    }
    public abstract void receiveTreatment();
    public abstract double calculateBill();
    public abstract String getTreatmentType();
    	public void registerPatient() {
        System.out.println("Registering patient: " + name + " (ID: " + patientId + ")");
        System.out.println("Age: " + age + ", Contact: " + contactNumber);
    }
    
    protected void displayBasicInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contactNumber);
        System.out.println("Base Treatment Cost: ₹" + treatmentCost);
    }
      public String getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
        }
    
    public String getContactNumber() {
        return contactNumber;
    }
    
    public double getTreatmentCost() {
        return treatmentCost;
    }
    
    // Setter methods
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public void setTreatmentCost(double treatmentCost) {
        this.treatmentCost = treatmentCost;
    }
}