import java.util.*;

class Faculty {
    String name;
    public Faculty(String name) { this.name = name; }
    public void display() { System.out.println("Faculty: " + name); }
}

class Department {
    String deptName;
    public Department(String deptName) { this.deptName = deptName; }
    public void display() { System.out.println("Department: " + deptName); }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    public University(String name) { this.name = name; }
    public void addDepartment(Department d) { departments.add(d); }
    public void addFaculty(Faculty f) { faculties.add(f); }
    public void showUniversity() {
        System.out.println("University: " + name);
        for (Department d : departments) d.display();
        for (Faculty f : faculties) f.display();
    }
}

public class TestUniversity {
    public static void main(String[] args) {
        University u = new University("IIT Kanpur");
        u.addDepartment(new Department("CSE"));
        u.addDepartment(new Department("EE"));
        u.addFaculty(new Faculty("Dr. Sharma"));
        u.addFaculty(new Faculty("Dr. Mehta"));

        u.showUniversity();
    }
}
