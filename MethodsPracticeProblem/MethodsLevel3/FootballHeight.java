import java.util.*;

public class FootballHeight {
    public static int sum(int arr[]){
        int s=0; for(int x:arr) s+=x; return s;
    }
    public static double mean(int arr[]){
        return (double)sum(arr)/arr.length;
    }
    public static int min(int arr[]){
        int m=arr[0]; for(int x:arr) if(x<m) m=x; return m;
    }
    public static int max(int arr[]){
        int m=arr[0]; for(int x:arr) if(x>m) m=x; return m;
    }
    public static void main(String[] args){
        int arr[]=new int[11];
        for(int i=0;i<11;i++) arr[i]=150+(int)(Math.random()*101);
        System.out.println(Arrays.toString(arr));
        System.out.println("Shortest="+min(arr));
        System.out.println("Tallest="+max(arr));
        System.out.println("Mean="+mean(arr));
    }
}
