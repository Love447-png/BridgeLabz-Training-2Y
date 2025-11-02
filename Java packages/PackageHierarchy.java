
// 2. Package Hierarchy Example

package com.university.department.cse;
public class Course {
    public void showDetails() {
        System.out.println("Course: B.Tech CSE, Duration: 4 years");
    }
}

// Main Class
import com.university.department.cse.Course;

public class PackageHierarchy {
    public static void main(String[] args) {
        Course c = new Course();
        c.showDetails();
    }
}

// Folder Structure Example:
// com/university/department/cse/Course.java
// MainApp.java (in default folder)
