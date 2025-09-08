import java.util.*;

public class QuotRem {
    public static int quotient(int a,int b){
        return a/b;
    }
    public static int remainder(int a,int b){
        return a%b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int a = sc.nextInt();
        System.out.print("Enter divisor: ");
        int b = sc.nextInt();
        System.out.println("Quotient = " + quotient(a,b));
        System.out.println("Remainder = " + remainder(a,b));
    }
}
