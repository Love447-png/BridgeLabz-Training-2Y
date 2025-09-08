import java.util.*;

public class NumberCheck {
    public static boolean isPositive(int n){
        return n>0;
    }
    public static boolean isEven(int n){
        return n%2==0;
    }
    public static int compare(int a,int b){
        if(a>b) return 1;
        else if(a==b) return 0;
        else return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter number: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            int n=arr[i];
            if(isPositive(n)){
                if(isEven(n)) System.out.println(n+" is Positive and Even");
                else System.out.println(n+" is Positive and Odd");
            } else if(n<0){
                System.out.println(n+" is Negative");
            } else {
                System.out.println("Zero");
            }
        }
        int res=compare(arr[0],arr[4]);
        if(res==0) System.out.println("First and Last Equal");
        else if(res==1) System.out.println("First Greater than Last");
        else System.out.println("First Smaller than Last");
    }
}
