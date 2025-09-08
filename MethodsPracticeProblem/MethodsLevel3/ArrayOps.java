import java.util.*;

public class ArrayOps {
    public static int max(int arr[]){
        int m=arr[0]; for(int x:arr) if(x>m) m=x; return m;
    }
    public static int min(int arr[]){
        int m=arr[0]; for(int x:arr) if(x<m) m=x; return m;
    }
    public static int sum(int arr[]){
        int s=0; for(int x:arr) s+=x; return s;
    }
    public static int product(int arr[]){
        int p=1; for(int x:arr) p*=x; return p;
    }
    public static void main(String[] args){
        int arr[]={5,2,7,1,9};
        System.out.println("Max="+max(arr));
        System.out.println("Min="+min(arr));
        System.out.println("Sum="+sum(arr));
        System.out.println("Product="+product(arr));
    }
}
