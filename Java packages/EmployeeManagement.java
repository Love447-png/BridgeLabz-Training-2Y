
// 6. Employee Management System (Multi-Package)

package com.company.hr;
public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id; this.name = name; this.department = department; this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

package com.company.payroll;
import com.company.hr.Employee;

public class Payroll {
    public void calculateBonus(Employee e) {
        double newSalary = e.getSalary() + e.getSalary() * 0.10;
        e.setSalary(newSalary);
    }
}

package com.company.main;
import com.company.hr.*;
import com.company.payroll.*;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Riya", "HR", 50000);
        Payroll p = new Payroll();
        p.calculateBonus(e);

        System.out.println("Employee: " + e.getName() + " | Dept: " + e.getDepartment() + " | Salary after bonus: " + e.getSalary());
    }
}
