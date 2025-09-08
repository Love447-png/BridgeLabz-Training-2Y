import java.util.*;

public class RandomStats {
    public static int[] generate(int n){
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(int)(Math.random()*9000)+1000;
        }
        return arr;
    }
    public static double avg(int arr[]){
        double s=0;
        for(int x:arr) s+=x;
        return s/arr.length;
    }
    public static int min(int arr[]){
        int m=arr[0];
        for(int x:arr) if(x<m) m=x;
        return m;
    }
    public static int max(int arr[]){
        int m=arr[0];
        for(int x:arr) if(x>m) m=x;
        return m;
    }
    public static void main(String[] args){
        int arr[]=generate(5);
        System.out.println("Numbers: "+Arrays.toString(arr));
        System.out.println("Average = "+avg(arr));
        System.out.println("Min = "+min(arr));
        System.out.println("Max = "+max(arr));
    }
}
