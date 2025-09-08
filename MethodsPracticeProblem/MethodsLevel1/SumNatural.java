import java.util.*;

public class SumNatural {
    public static int sumN(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            s+=i;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int res = sumN(n);
        System.out.println("Sum = " + res);
    }
}
