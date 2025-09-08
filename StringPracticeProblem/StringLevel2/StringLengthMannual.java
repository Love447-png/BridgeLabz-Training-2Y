import java.util.*;
public class StringLengthManual {
    public static int myLength(String s){
        int count = 0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        } catch(Exception e){
        }
        return count;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println("Manual length = " + myLength(s));
        System.out.println("Built-in length = " + s.length());
    }
}
