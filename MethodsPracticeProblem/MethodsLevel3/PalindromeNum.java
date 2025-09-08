import java.util.*;

public class PalindromeNum {
    public static boolean isPal(int n){
        int rev=0,orig=n;
        while(n>0){ rev=rev*10+(n%10); n/=10; }
        return rev==orig;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPal(n)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
