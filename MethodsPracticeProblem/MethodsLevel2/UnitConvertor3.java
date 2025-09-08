import java.util.*;

public class UnitConverter3 {
    public static double fToC(double f){
        return (f-32)*5/9;
    }
    public static double cToF(double c){
        return (c*9/5)+32;
    }
    public static double poundsToKg(double p){
        return p*0.453592;
    }
    public static double kgToPounds(double kg){
        return kg*2.20462;
    }
    public static double gallonsToLiters(double g){
        return g*3.78541;
    }
    public static double litersToGallons(double l){
        return l*0.264172;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter F: ");
        double f=sc.nextDouble();
        System.out.println("C = " + fToC(f));

        System.out.print("Enter C: ");
        double c=sc.nextDouble();
        System.out.println("F = " + cToF(c));

        System.out.print("Enter pounds: ");
        double p=sc.nextDouble();
        System.out.println("Kg = " + poundsToKg(p));

        System.out.print("Enter kg: ");
        double kg=sc.nextDouble();
        System.out.println("Pounds = " + kgToPounds(kg));

        System.out.print("Enter gallons: ");
        double g=sc.nextDouble();
        System.out.println("Liters = " + gallonsToLiters(g));

        System.out.print("Enter liters: ");
        double l=sc.nextDouble();
        System.out.println("Gallons = " + litersToGallons(l));
    }
}
