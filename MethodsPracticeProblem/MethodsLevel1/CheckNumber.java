import java.util.*;

public class CheckNumber {
    public static int check(int n){
        if(n<0) return -1;
        else if(n>0) return 1;
        else return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int res = check(n);
        if(res==1) System.out.println("Positive");
        else if(res==-1) System.out.println("Negative");
        else System.out.println("Zero");
    }
}
