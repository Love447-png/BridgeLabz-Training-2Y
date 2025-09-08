import java.util.*;

public class QuadraticRoots {
    public static double[] roots(int a,int b,int c){
        double d=b*b-4*a*c;
        if(d<0) return new double[0];
        if(d==0){
            double r=-b/(2.0*a);
            return new double[]{r};
        } else {
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            return new double[]{r1,r2};
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a b c: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double arr[]=roots(a,b,c);
        if(arr.length==0) System.out.println("No Real Roots");
        else if(arr.length==1) System.out.println("One Root: "+arr[0]);
        else System.out.println("Two Roots: "+arr[0]+" and "+arr[1]);
    }
}
