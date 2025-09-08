import java.util.*;

public class EvenOddSum {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        int se=0,so=0;
        for(int x:arr){
            if(x%2==0) se+=x;
            else so+=x;
        }
        System.out.println("Even Sum="+se);
        System.out.println("Odd Sum="+so);
    }
}
