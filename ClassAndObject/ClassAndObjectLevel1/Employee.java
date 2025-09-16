public class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.printf("Salary : %.2f\n", salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Asha R.", 101, 45000.00);
        Employee e2 = new Employee("Rahul M.", 102, 52000.50);

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
    }
}
