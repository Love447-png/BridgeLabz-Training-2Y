import java.util.*;

public class SumNatural {
    public static int recSum(int n){
        if(n==0) return 0;
        return n+recSum(n-1);
    }
    public static int formulaSum(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Not a natural number");
            return;
        }
        int r1=recSum(n);
        int r2=formulaSum(n);
        System.out.println("Recursion Sum = " + r1);
        System.out.println("Formula Sum = " + r2);
    }
}
