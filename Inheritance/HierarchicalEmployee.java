class HierarchicalEmployee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Teacher extends Employee {
    String subject;

    Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

class Administrator extends Employee {
    String department;

    Administrator(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee t = new Teacher("Asha", 101, "Math");
        Employee a = new Administrator("Ravi", 102, "IT");

        t.display();
        a.display();
    }
}
