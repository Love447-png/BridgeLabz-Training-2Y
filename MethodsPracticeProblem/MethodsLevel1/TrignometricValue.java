import java.util.*;

public class TrignometricValues {
    public static double toRadians(double deg){
        return deg*Math.PI/180;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double deg = sc.nextDouble();
        double rad = toRadians(deg);
        System.out.println("sin = " + Math.sin(rad));
        System.out.println("cos = " + Math.cos(rad));
        System.out.println("tan = " + Math.tan(rad));
    }
}
