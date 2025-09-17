interface MedicalRecord {
    void addRecord(String record);
}

abstract class Patient {
    private int id;
    private String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public abstract void displayDetails();
}

class InPatient extends Patient implements MedicalRecord {
    private String room;

    public InPatient(int id, String name, String room) {
        super(id, name);
        this.room = room;
    }

    @Override
    public void displayDetails() {
        System.out.println("In-Patient: " + getName() + " | Room: " + room);
    }

    @Override
    public void addRecord(String record) {
        System.out.println("Medical record added for " + getName() + ": " + record);
    }
}

class OutPatient extends Patient {
    private String appointmentDate;

    public OutPatient(int id, String name, String appointmentDate) {
        super(id, name);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Out-Patient: " + getName() + " | Appointment: " + appointmentDate);
    }
}

public class TestPatient {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "Neha", "Room 101");
        Patient p2 = new OutPatient(2, "Rahul", "20 Sep");

        p1.displayDetails();
        if (p1 instanceof MedicalRecord m) m.addRecord("Blood Test Report");

        p2.displayDetails();
    }
}
