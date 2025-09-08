import java.util.*;

public class ArrayCheck {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++) if(n%i==0) return false;
        return true;
    }
    public static boolean isPal(int n){
        int rev=0,orig=n;
        while(n>0){ rev=rev*10+(n%10); n/=10; }
        return rev==orig;
    }
    public static void main(String[] args){
        int arr[]={11,22,33,44,55};
        for(int x:arr){
            if(x%2==0) System.out.println(x+" Even");
            else System.out.println(x+" Odd");
            if(isPrime(x)) System.out.println("Prime");
            if(isPal(x)) System.out.println("Palindrome");
        }
    }
}
