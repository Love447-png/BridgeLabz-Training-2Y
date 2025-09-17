import java.util.*;

class Course {
    String name;
    Professor professor;
    List<Student> students = new ArrayList<>();
    public Course(String name) { this.name = name; }
    public void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.name + " assigned to " + name);
    }
    public void addStudent(Student s) {
        students.add(s);
        System.out.println(s.name + " enrolled in " + name);
    }
}

class Student {
    String name;
    public Student(String name) { this.name = name; }
    public void enrollCourse(Course c) { c.addStudent(this); }
}

class Professor {
    String name;
    public Professor(String name) { this.name = name; }
}

public class TestUniversitySystem {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Asha");

        Professor p = new Professor("Dr. Sharma");

        Course c1 = new Course("Java Programming");
        c1.assignProfessor(p);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
    }
}
