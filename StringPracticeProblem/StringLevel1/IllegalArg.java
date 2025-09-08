import java.util.*;
public class IllegalArg {
    public static void causeError(String s){
        System.out.println(s.substring(5,2)); // invalid
    }
    public static void handleError(String s){
        try{
            System.out.println(s.substring(5,2));
        } catch(IllegalArgumentException e){
            System.out.println("Caught IllegalArgumentException");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        handleError(s);
    }
}
