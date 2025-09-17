import java.util.*;

class Patient {
    String name;
    public Patient(String name) { this.name = name; }
}

class Doctor {
    String name;
    public Doctor(String name) { this.name = name; }
    public void consult(Patient p) {
        System.out.println("Doctor " + name + " consults Patient " + p.name);
    }
}

class Hospital {
    String name;
    public Hospital(String name) { this.name = name; }
}

public class TestHospital {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Asha");
        Doctor d2 = new Doctor("Dr. Ravi");

        Patient p1 = new Patient("Neha");
        Patient p2 = new Patient("Rahul");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}
