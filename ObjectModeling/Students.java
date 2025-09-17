import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();
    public Course(String name) { this.name = name; }
    public void addStudent(Student s) { students.add(s); }
    public void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) System.out.println(" - " + s.name);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    public Student(String name) { this.name = name; }
    public void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }
    public void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) System.out.println(" - " + c.name);
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();
    public School(String name) { this.name = name; }
    public void addStudent(Student s) { students.add(s); }
}

public class TestSchool {
    public static void main(String[] args) {
        School s = new School("City School");
        Student st1 = new Student("Rahul");
        Student st2 = new Student("Neha");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s.addStudent(st1);
        s.addStudent(st2);

        st1.enroll(c1);
        st1.enroll(c2);
        st2.enroll(c1);

        st1.showCourses();
        st2.showCourses();
        c1.showStudents();
    }
}
