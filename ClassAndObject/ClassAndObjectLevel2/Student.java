// Student.java
public class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A+";
        if (marks >= 80) return "A";
        if (marks >= 70) return "B";
        if (marks >= 60) return "C";
        if (marks >= 50) return "D";
        return "F";
    }

    public void display() {
        System.out.println("Student Report");
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Marks(%)   : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Neha", 23, 87.5);
        Student s2 = new Student("Vikram", 24, 47.0);

        s1.display();
        System.out.println();
        s2.display();
    }
}
