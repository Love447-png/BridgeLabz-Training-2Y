import java.util.*;

public class NumberCheck4 {
    public static int sumFactors(int n){
        int s=0;
        for(int i=1;i<=n/2;i++) if(n%i==0) s+=i;
        return s;
    }
    public static boolean isPerfect(int n){ return sumFactors(n)==n; }
    public static boolean isAbundant(int n){ return sumFactors(n)>n; }
    public static boolean isDeficient(int n){ return sumFactors(n)<n; }
    public static int fact(int n){ int f=1; for(int i=1;i<=n;i++) f*=i; return f; }
    public static boolean isStrong(int n){
        int sum=0,temp=n;
        while(n>0){ sum+=fact(n%10); n/=10; }
        return sum==temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Perfect="+isPerfect(n));
        System.out.println("Abundant="+isAbundant(n));
        System.out.println("Deficient="+isDeficient(n));
        System.out.println("Strong="+isStrong(n));
    }
}
