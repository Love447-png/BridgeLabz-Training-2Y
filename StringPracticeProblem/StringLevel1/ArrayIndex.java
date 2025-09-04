import java.util.*;
public class ArrayIndexDemo {
    public static void causeError(String[] arr){
        System.out.println(arr[arr.length]); // invalid index
    }
    public static void handleError(String[] arr){
        try{
            System.out.println(arr[arr.length]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String arr[] = new String[3];
        for(int i=0;i<3;i++){
            arr[i] = input.next();
        }
        handleError(arr);
    }
}
