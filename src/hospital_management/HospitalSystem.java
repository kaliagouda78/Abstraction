package hospital_management;

public class HospitalSystem {
    public static void main(String[] args) {
        System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===");
        System.out.println();
        Patient[] patients = {
            new EmergencyPatient("ER001", "John Doe", 35, "9876543210", 
                               5000.0, "Critical", true),
            
            new OutPatient("OP001", "Jane Smith", 28, "9876543211", 
                          500.0, "10:00 AM", "Dr. Wilson", true),
            
            new InPatient("IP001", "Bob Johnson", 45, "9876543212", 
                         2000.0, 3, "Private", "2024-01-15"),
            
            new SurgeryPatient("SP001", "Alice Brown", 52, "9876543213", 
                              50000.0, "Heart Surgery", "Dr. Anderson", 4, false),
            
            new EmergencyPatient("ER002", "Mike Wilson", 40, "9876543214", 
                               3000.0, "High", false),
            
            new OutPatient("OP002", "Sarah Davis", 33, "9876543215", 
                          800.0, "2:30 PM", "Dr. Johnson", false)
        };
        
        System.out.println("=== PATIENT REGISTRATION ===");
        registerAllPatients(patients);
        
        System.out.println("\n=== TREATMENT PROCESSING ===");
        processTreatments(patients);
        
        System.out.println("\n=== BILLING SUMMARY ===");
        generateBills(patients);
        
        System.out.println("\n=== PATIENT SUMMARY ===");
        displayPatientSummary(patients);
        
        System.out.println("\n=== HOSPITAL STATISTICS ===");
        displayHospitalStats(patients);
    }
 public static void registerAllPatients(Patient[] patients) {
        for (Patient patient : patients) {
            patient.registerPatient();
            System.out.println("------------------------");
        }
    }
public static void processTreatments(Patient[] patients) {
        for (Patient patient : patients) {
            System.out.println("Processing: " + patient.getName());
            patient.receiveTreatment();
            System.out.println("------------------------");
        }
    }
	public static void generateBills(Patient[] patients) {
        double totalRevenue = 0;
        
        for (Patient patient : patients) {
            double bill = patient.calculateBill();
            totalRevenue += bill;
            
            System.out.println("Patient: " + patient.getName() + 
                             " | ID: " + patient.getPatientId() +
                             " | Treatment: " + patient.getTreatmentType() + 
                             " | Bill: ₹" + String.format("%.2f", bill));
        }
        
        System.out.println("========================");
        System.out.println("TOTAL HOSPITAL REVENUE: ₹" + String.format("%.2f", totalRevenue));
    }
		public static void displayPatientSummary(Patient[] patients) {
        for (Patient patient : patients) {
            System.out.println("=== " + patient.getTreatmentType() + " ===");
            if (patient instanceof EmergencyPatient) {
                ((EmergencyPatient) patient).displayEmergencyInfo();
            } else if (patient instanceof OutPatient) {
                ((OutPatient) patient).displayOutPatientInfo();
            } else if (patient instanceof InPatient) {
                ((InPatient) patient).displayInPatientInfo();
            } else if (patient instanceof SurgeryPatient) {
                ((SurgeryPatient) patient).displaySurgeryInfo();
            }
            
            System.out.println("------------------------");
        }
    }
		public static void displayHospitalStats(Patient[] patients) {
        int emergencyCount = 0;
        int outPatientCount = 0;
        int inPatientCount = 0;
        int surgeryCount = 0;
        
        double totalRevenue = 0;
        double highestBill = 0;
        String highestBillPatient = "";
        
        for (Patient patient : patients) {
           
            if (patient instanceof EmergencyPatient) emergencyCount++;
            else if (patient instanceof OutPatient) outPatientCount++;
            else if (patient instanceof InPatient) inPatientCount++;
            else if (patient instanceof SurgeryPatient) surgeryCount++;

            double bill = patient.calculateBill();
            totalRevenue += bill;
            
            if (bill > highestBill) {
                highestBill = bill;
                highestBillPatient = patient.getName();
            }
        }
        
        System.out.println("Total Patients: " + patients.length);
        System.out.println("Emergency Patients: " + emergencyCount);
        System.out.println("OutPatients: " + outPatientCount);
        System.out.println("InPatients: " + inPatientCount);
        System.out.println("Surgery Patients: " + surgeryCount);
        System.out.println();
        System.out.println("Total Revenue: ₹" + String.format("%.2f", totalRevenue));
        System.out.println("Average Bill: ₹" + String.format("%.2f", totalRevenue / patients.length));
        System.out.println("Highest Bill: ₹" + String.format("%.2f", highestBill) + 
                          " (Patient: " + highestBillPatient + ")");
    }
    
    // Method to find patients by type (demonstrating polymorphism)
    public static void findPatientsByType(Patient[] patients, Class<?> patientType) {
        System.out.println("Patients of type: " + patientType.getSimpleName());
        
        for (Patient patient : patients) {
            if (patientType.isInstance(patient)) {
                System.out.println("- " + patient.getName() + " (" + patient.getPatientId() + ")");
            }
        }
    }

    public static Patient findPatientById(Patient[] patients, String patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientId().equals(patientId)) {
                return patient;
            }
        }
        return null;  // Patient not found
    }

    public static Patient[] addPatient(Patient[] patients, Patient newPatient) {
        Patient[] newArray = new Patient[patients.length + 1];
        
        for (int i = 0; i < patients.length; i++) {
            newArray[i] = patients[i];
        }
        
       
        newArray[patients.length] = newPatient;
        
        return newArray;
    }
    
   
    public static Patient[] removePatient(Patient[] patients, String patientId) {
        int removeIndex = -1;
       for (int i = 0; i < patients.length; i++) {
            if (patients[i].getPatientId().equals(patientId)) {
                removeIndex = i;
                break;
            }
        }
        
        if (removeIndex == -1) {
            System.out.println("Patient with ID " + patientId + " not found");
            return patients; 
        }
       
        Patient[] newArray = new Patient[patients.length - 1];
        	for (int i = 0; i < removeIndex; i++) {
            newArray[i] = patients[i];
        }
        	for (int i = removeIndex + 1; i < patients.length; i++) {
            newArray[i - 1] = patients[i];
        }
        
        return newArray;
    }
}