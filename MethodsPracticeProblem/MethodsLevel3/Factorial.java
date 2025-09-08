import java.util.*;

public class Factorial {
    public static int factRec(int n){
        if(n<=1) return 1;
        return n*factRec(n-1);
    }
    public static int factItr(int n){
        int f=1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Rec="+factRec(n));
        System.out.println("Itr="+factItr(n));
    }
}
