package hospital_management;

public class OutPatient extends Patient {
    private String appointmentTime;
    private String doctorAssigned;
    private boolean followUpRequired;
    public OutPatient(String patientId, String name, int age, String contactNumber, 
                     double treatmentCost, String appointmentTime, String doctorAssigned, 
                     boolean followUpRequired) {
        super(patientId, name, age, contactNumber, treatmentCost);
        this.appointmentTime = appointmentTime;
        this.doctorAssigned = doctorAssigned;
        this.followUpRequired = followUpRequired;
    }
    @Override
    public void receiveTreatment() {
        System.out.println("Outpatient " + name + " receiving consultation in OPD");
        System.out.println("Appointment Time: " + appointmentTime);
        System.out.println("Consulting with: " + doctorAssigned);
        
        if (followUpRequired) {
            scheduleFollowUp();
        }
    }
    
    @Override
    public double calculateBill() {
        double totalBill = treatmentCost;
        	if (followUpRequired) {
            totalBill += 300.0;
        }
        	totalBill += 150.0;
        return totalBill;
    }
    
    @Override
    public String getTreatmentType() {
        return "Outpatient Consultation" + (followUpRequired ? " with Follow-up" : "");
    }

    public void scheduleFollowUp() {
        System.out.println("Scheduling follow-up appointment for " + name);
        System.out.println("Follow-up recommended with " + doctorAssigned);
        System.out.println("Please visit reception to book next appointment");
    }

    public void issuePrescription() {
        System.out.println("Prescription issued by " + doctorAssigned);
        System.out.println("Please collect medicines from pharmacy");
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }
    
    public String getDoctorAssigned() {
        return doctorAssigned;
    }
    
    public boolean isFollowUpRequired() {
        return followUpRequired;
    }
    
   
    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
    
    public void setDoctorAssigned(String doctorAssigned) {
        this.doctorAssigned = doctorAssigned;
    }
    
    public void setFollowUpRequired(boolean followUpRequired) {
        this.followUpRequired = followUpRequired;
    }
 
    public void displayOutPatientInfo() {
        displayBasicInfo();  // Call parent method
        System.out.println("Appointment Time: " + appointmentTime);
        System.out.println("Doctor Assigned: " + doctorAssigned);
        System.out.println("Follow-up Required: " + (followUpRequired ? "Yes" : "No"));
        System.out.println("Treatment Type: " + getTreatmentType());
        System.out.println("Total Bill: ₹" + calculateBill());
    }
}