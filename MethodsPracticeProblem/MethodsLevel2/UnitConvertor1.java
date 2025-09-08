import java.util.*;

public class UnitConverter1 {
    public static double kmToMiles(double km){
        return km*0.621371;
    }
    public static double milesToKm(double mi){
        return mi*1.60934;
    }
    public static double mToFeet(double m){
        return m*3.28084;
    }
    public static double feetToM(double f){
        return f*0.3048;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter km: ");
        double km=sc.nextDouble();
        System.out.println("Miles = " + kmToMiles(km));

        System.out.print("Enter miles: ");
        double mi=sc.nextDouble();
        System.out.println("Km = " + milesToKm(mi));

        System.out.print("Enter meters: ");
        double m=sc.nextDouble();
        System.out.println("Feet = " + mToFeet(m));

        System.out.print("Enter feet: ");
        double f=sc.nextDouble();
        System.out.println("Meters = " + feetToM(f));
    }
}
