import java.util.*;

public class ArraySquaresCubes {
    public static boolean isSquare(int n){
        int r=(int)Math.sqrt(n);
        return r*r==n;
    }
    public static boolean isCube(int n){
        int r=(int)Math.round(Math.cbrt(n));
        return r*r*r==n;
    }
    public static void main(String[] args){
        int arr[]={4,8,9,16,27,30};
        for(int x:arr){
            if(isSquare(x)) System.out.println(x+" Square");
            if(isCube(x)) System.out.println(x+" Cube");
        }
    }
}
