import java.util.*;

public class TriangularPark {
    public static double calcRounds(double a, double b, double c){
        double peri = a+b+c;
        double rounds = 5000/peri;
        return rounds;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double r = calcRounds(a,b,c);
        System.out.println("Rounds to complete 5km = " + r);
    }
}
