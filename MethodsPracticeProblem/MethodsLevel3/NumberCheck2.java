import java.util.*;

public class NumberCheck2 {
    public static int[] getDigits(int n){
        String s=""+n;
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++) arr[i]=s.charAt(i)-'0';
        return arr;
    }
    public static int sum(int arr[]){ int s=0; for(int d:arr) s+=d; return s; }
    public static int sumSquares(int arr[]){ int s=0; for(int d:arr) s+=d*d; return s; }
    public static boolean isHarshad(int n,int arr[]){ return n%sum(arr)==0; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=getDigits(n);
        System.out.println("Sum="+sum(arr));
        System.out.println("Squares sum="+sumSquares(arr));
        System.out.println("Harshad="+isHarshad(n,arr));
        int freq[]=new int[10];
        for(int d:arr) freq[d]++;
        for(int i=0;i<10;i++) if(freq[i]>0) System.out.println(i+"->"+freq[i]);
    }
}
