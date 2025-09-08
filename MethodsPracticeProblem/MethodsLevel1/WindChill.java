import java.util.*;

public class WindChill {
    public static double calcWC(double t, double v){
        return 35.74 + 0.6215*t + (0.4275*t-35.75)*Math.pow(v,0.16);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Temp (F): ");
        double t = sc.nextDouble();
        System.out.print("Wind speed (mph): ");
        double v = sc.nextDouble();
        if(t<=50 && v>=3 && v<=120){
            double wc = calcWC(t,v);
            System.out.println("Wind Chill = " + wc);
        } else {
            System.out.println("Values out of range");
        }
    }
}
