import java.util.*;

public class UnitConverter2 {
    public static double yardsToFeet(double y){
        return y*3;
    }
    public static double feetToYards(double f){
        return f*0.333333;
    }
    public static double mToInches(double m){
        return m*39.3701;
    }
    public static double inchesToM(double in){
        return in*0.0254;
    }
    public static double inchesToCm(double in){
        return in*2.54;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter yards: ");
        double y=sc.nextDouble();
        System.out.println("Feet = " + yardsToFeet(y));

        System.out.print("Enter feet: ");
        double f=sc.nextDouble();
        System.out.println("Yards = " + feetToYard
