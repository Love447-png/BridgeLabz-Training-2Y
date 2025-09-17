public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Tech Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + " (" + duration + " months, ₹" + fee + ")");
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 15000);
        c1.displayCourseDetails();

        Course.updateInstituteName("Skill Academy");
        Course c2 = new Course("Python", 2, 12000);
        c2.displayCourseDetails();
    }
}
