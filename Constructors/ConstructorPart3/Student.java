class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }
}

class PostgraduateStudent extends Student {
    private String thesis;

    public PostgraduateStudent(int roll, String name, double cgpa, String thesis) {
        super(roll, name, cgpa);
        this.thesis = thesis;
    }

    public void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name +
                ", CGPA: " + getCgpa() + ", Thesis: " + thesis);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Neha", 9.1, "AI Research");
        pg.display();
    }
}
