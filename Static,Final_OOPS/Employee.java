public class Employee {
    private String name;
    private final int id;
    private String designation;

    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;

    public Employee(String name, int id, String designation) {
        this.name = name;   
        this.id = id;       
        this.designation = designation;
        totalEmployees++;
    }

    public void display() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Neha", 101, "Developer");
        Employee e2 = new Employee("Vikram", 102, "Manager");

        e1.display();
        System.out.println();
        e2.display();
        Employee.displayTotalEmployees();
    }
}
