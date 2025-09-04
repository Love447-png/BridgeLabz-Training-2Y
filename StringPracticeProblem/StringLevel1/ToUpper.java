import java.util.*;

public class ToUpper {
    public static String myUpper(String s){
        String res = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
            }
            res += ch;
        }
        return res;
    }
    public static boolean compare(String a, String b){
        if(a.length() != b.length()) return false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = input.nextLine();
        String u1 = myUpper(s);
        String u2 = s.toUpperCase();
        System.out.println("User Upper: " + u1);
        System.out.println("Built-in Upper: " + u2);
        System.out.println("Equal? " + compare(u1,u2));
    }
}
