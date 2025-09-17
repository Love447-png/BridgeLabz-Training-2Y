import java.util.*;

class Employee {
    String name;
    public Employee(String name) { this.name = name; }
    public void display() { System.out.println("Employee: " + name); }
}

class Department {
    String deptName;
    List<Employee> employees = new ArrayList<>();
    public Department(String deptName) { this.deptName = deptName; }
    public void addEmployee(Employee e) { employees.add(e); }
    public void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) e.display();
    }
}

class Company {
    String companyName;
    List<Department> departments = new ArrayList<>();
    public Company(String companyName) { this.companyName = companyName; }
    public void addDepartment(Department d) { departments.add(d); }
    public void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) d.showEmployees();
    }
}

public class TestCompany {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");
        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee(new Employee("Neha"));
        d1.addEmployee(new Employee("Ravi"));
        d2.addEmployee(new Employee("Asha"));

        c.addDepartment(d1);
        c.addDepartment(d2);

        c.showCompany();
    }
}
