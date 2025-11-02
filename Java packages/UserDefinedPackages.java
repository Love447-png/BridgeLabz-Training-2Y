
// 1. Creating and Using User-Defined Packages

package college.student;
public class Student {
    public void display(String name, int roll) {
        System.out.println("Student Name: " + name + ", Roll No: " + roll);
    }
}

package college.faculty;
public class Faculty {
    public void display(String name, String subject) {
        System.out.println("Faculty Name: " + name + ", Subject: " + subject);
    }
}

// Main Class (Default Package)
import college.student.Student;
import college.faculty.Faculty;

public class UserDefinedPackages {
    public static void main(String[] args) {
        Student s = new Student();
        s.display("Aarohi", 101);

        Faculty f = new Faculty();
        f.display("Dr. Mehta", "Computer Science");
    }
}
