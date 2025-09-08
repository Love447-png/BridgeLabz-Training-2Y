import java.util.*;

public class NumberCheck1 {
    public static int countDigits(int n){
        int c=0; while(n>0){ c++; n/=10; } return c;
    }
    public static int[] getDigits(int n){
        int c=countDigits(n);
        int arr[]=new int[c];
        for(int i=c-1;i>=0;i--){
            arr[i]=n%10; n/=10;
        }
        return arr;
    }
    public static boolean isDuck(int arr[]){
        for(int x:arr) if(x==0) return true;
        return false;
    }
    public static boolean isArmstrong(int arr[]){
        int c=arr.length, sum=0;
        for(int d:arr) sum+=Math.pow(d,c);
        int num=0;
        for(int d:arr) num=num*10+d;
        return sum==num;
    }
    public static int[] largestTwo(int arr[]){
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE;
        for(int d:arr){
            if(d>max1){ max2=max1; max1=d; }
            else if(d>max2 && d!=max1) max2=d;
        }
        return new int[]{max1,max2};
    }
    public static int[] smallestTwo(int arr[]){
        int min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
        for(int d:arr){
            if(d<min1){ min2=min1; min1=d; }
            else if(d<min2 && d!=min1) min2=d;
        }
        return new int[]{min1,min2};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=getDigits(n);
        System.out.println("Duck? "+isDuck(arr));
        System.out.println("Armstrong? "+isArmstrong(arr));
        int lg[]=largestTwo(arr);
        System.out.println("Largest: "+lg[0]+" Second: "+lg[1]);
        int sm[]=smallestTwo(arr);
        System.out.println("Smallest: "+sm[0]+" Second: "+sm[1]);
    }
}
