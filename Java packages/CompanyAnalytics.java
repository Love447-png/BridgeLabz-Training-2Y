
// 10. Company Analytics with Sub-Packages

package com.company.analytics.sales;
public class SalesReport {
    public void printReport() {
        System.out.println("Sales Report: North - 1Cr, South - 0.8Cr");
    }
}

package com.company.analytics.hr;
public class EmployeeReport {
    public void printReport() {
        System.out.println("HR Report: 50 Employees, 5 New Hires");
    }
}

// Main Class
import com.company.analytics.sales.*;
import com.company.analytics.hr.*;

public class CompanyAnalytics {
    public static void main(String[] args) {
        SalesReport s = new SalesReport();
        EmployeeReport e = new EmployeeReport();
        s.printReport();
        e.printReport();
        System.out.println("Combined Company Report Generated!");
    }
}
