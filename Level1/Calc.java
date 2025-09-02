import java.util.*;
class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Add=" + (a+b));
        System.out.println("Sub=" + (a-b));
        System.out.println("Mul=" + (a*b));
        System.out.println("Div=" + (b!=0? a/b : "NA"));
        sc.close();
    }
}
