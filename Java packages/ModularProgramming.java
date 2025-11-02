
// 4. Modular Programming (Java 9+ Example)

// Module 1: collegeinfo -> module-info.java
/*
module collegeinfo {
    exports college.student;
}
*/

package college.student;
public class Student {
    public void show() {
        System.out.println("Student Module Loaded Successfully!");
    }
}

// Module 2: app -> module-info.java
/*
module app {
    requires collegeinfo;
}
*/

// MainApp.java
import college.student.Student;

public class ModularProgramming {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}

// To compile/run:
// javac -d out --module-source-path src $(find . -name "*.java")
// java --module-path out -m app/ModularProgramming
