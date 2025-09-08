import java.util.*;

public class DivisibleArray {
    public static void main(String[] args){
        int arr[]={10,15,20,7,8,9};
        for(int x:arr){
            if(x%2==0) System.out.println(x+" Div by 2");
            if(x%3==0) System.out.println(x+" Div by 3");
            if(x%5==0) System.out.println(x+" Div by 5");
        }
    }
}
