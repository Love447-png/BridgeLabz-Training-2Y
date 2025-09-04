import java.util.*;

public class StringIndex {
    public static void causeError(String s){
        System.out.println(s.charAt(s.length())); // invalid index
    }

    public static void handleError(String s){
        try{
            System.out.println(s.charAt(s.length()));
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("Caught StringIndexOutOfBoundsException");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = input.next();
        handleError(s);
    }
}
