public class Patient {
    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID; 
        totalPatients++;
    }

    public void display() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Asha", 25, "Fever", 1);
        Patient p2 = new Patient("Rahul", 40, "Diabetes", 2);

        p1.display();
        System.out.println();
        p2.display();
        Patient.getTotalPatients();
    }
}
