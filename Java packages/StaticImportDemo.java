
// 3. Static Import Demonstration

import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double a = 25.0, b = 16.0;

        System.out.println("Square root of 25: " + sqrt(a));
        System.out.println("Power 2^3: " + pow(2, 3));
        System.out.println("Max(25,16): " + max(a, b));
        System.out.println("Min(25,16): " + min(a, b));
        System.out.println("Absolute value of -5: " + abs(-5));
    }
}
