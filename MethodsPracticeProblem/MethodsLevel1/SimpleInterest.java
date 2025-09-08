import java.util.*;

public class SimpleInterest {
    public static double calcSI(double p, double r, double t){
        return (p*r*t)/100.0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = sc.nextDouble();
        System.out.print("Rate: ");
        double r = sc.nextDouble();
        System.out.print("Time: ");
        double t = sc.nextDouble();

        double si = calcSI(p,r,t);
        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate " + r + " and Time " + t);
    }
}
