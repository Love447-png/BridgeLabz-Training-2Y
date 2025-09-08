import java.util.*;

public class FactorsCalc {
    public static int[] getFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        int arr[] = new int[count];
        int k=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[k++]=i;
            }
        }
        return arr;
    }
    public static int sum(int arr[]){
        int s=0;
        for(int x:arr) s+=x;
        return s;
    }
    public static int product(int arr[]){
        int p=1;
        for(int x:arr) p*=x;
        return p;
    }
    public static int sumSquare(int arr[]){
        int s=0;
        for(int x:arr) s+=Math.pow(x,2);
        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int arr[]=getFactors(n);
        System.out.println("Factors: " + Arrays.toString(arr));
        System.out.println("Sum = " + sum(arr));
        System.out.println("Product = " + product(arr));
        System.out.println("Sum of Squares = " + sumSquare(arr));
    }
}
