public class Student {
    private String name;
    private final int rollNumber;
    private String grade;

    private static String universityName = "ABC University";
    private static int totalStudents = 0;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber; 
        this.grade = grade;
        totalStudents++;
    }

    public void display() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Asha", 101, "A");
        Student s2 = new Student("Rahul", 102, "B");

        s1.display();
        System.out.println();
        s2.display();
        Student.displayTotalStudents();
    }
}
