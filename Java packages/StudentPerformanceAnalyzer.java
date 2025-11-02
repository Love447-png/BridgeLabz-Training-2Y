
// 7. Student Performance Analyzer

package com.school.data;
public class Student {
    public String name;
    public double m1, m2, m3;

    public Student(String name, double m1, double m2, double m3) {
        this.name = name; this.m1 = m1; this.m2 = m2; this.m3 = m3;
    }

    public String toString() {
        return "Student: " + name + " | Marks: " + m1 + ", " + m2 + ", " + m3;
    }
}

package com.school.util;
import com.school.data.Student;

public class Analyzer {
    public double calculateAverage(Student s) {
        return (s.m1 + s.m2 + s.m3) / 3;
    }
    public String findGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else return "C";
    }
}

// Main Class
import com.school.data.*;
import com.school.util.*;

public class StudentPerformanceAnalyzer {
    public static void main(String[] args) {
        Student s = new Student("Aarohi", 85, 92, 78);
        Analyzer a = new Analyzer();
        double avg = a.calculateAverage(s);
        String grade = a.findGrade(avg);

        System.out.println(s);
        System.out.println("Average: " + avg + " | Grade: " + grade);
    }
}
