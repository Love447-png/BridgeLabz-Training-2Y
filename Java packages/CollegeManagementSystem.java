
// 11. Mini Project – College Management System

package college.student;
public class Student {
    public String name;
    public Student(String name) { this.name = name; }
    public void display() { System.out.println("Student: " + name); }
}

package college.faculty;
public class Faculty {
    public String name;
    public Faculty(String name) { this.name = name; }
    public void display() { System.out.println("Faculty: " + name); }
}

package college.department;
public class Department {
    public String deptName;
    public Department(String deptName) { this.deptName = deptName; }
    public void display() { System.out.println("Department: " + deptName); }
}

// MainApp
import college.student.*;
import college.faculty.*;
import college.department.*;

public class CollegeManagementSystem {
    public static void main(String[] args) {
        Student s = new Student("Riya");
        Faculty f = new Faculty("Dr. Sharma");
        Department d = new Department("Computer Science");

        s.display();
        f.display();
        d.display();
    }
}
