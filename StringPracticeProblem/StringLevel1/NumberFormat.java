import java.util.*;

public class NumberFormat {
    public static void causeError(String txt){
        int n = Integer.parseInt(txt);
        System.out.println(n);
    }

    public static void handleError(String txt){
        try{
            int n = Integer.parseInt(txt);
            System.out.println(n);
        } catch(NumberFormatException e){
            System.out.println("Caught NumberFormatException");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String t = input.next();
        handleError(t);
    }
}
