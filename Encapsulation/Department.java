interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String dept) { this.department = dept; }

    @Override
    public String getDepartmentDetails() { return department; }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String department;

    public PartTimeEmployee(int id, String name, double rate, int hoursWorked) {
        super(id, name, rate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    @Override
    public void assignDepartment(String dept) { this.department = dept; }

    @Override
    public String getDepartmentDetails() { return department; }
}

import java.util.*;

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee f = new FullTimeEmployee(1, "Neha", 50000);
        f.assignDepartment("IT");
        PartTimeEmployee p = new PartTimeEmployee(2, "Rahul", 500, 40);
        p.assignDepartment("Support");

        employees.add(f);
        employees.add(p);

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Salary: " + e.calculateSalary());
            if (e instanceof Department d) {
                System.out.println("Department: " + d.getDepartmentDetails());
            }
            System.out.println();
        }
    }
}
