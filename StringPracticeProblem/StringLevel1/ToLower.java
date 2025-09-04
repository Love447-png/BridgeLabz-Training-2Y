import java.util.*;

public class ToLower {
    public static String myLower(String s){
        String res = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + 32);
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
        String l1 = myLower(s);
        String l2 = s.toLowerCase();
        System.out.println("User Lower: " + l1);
        System.out.println("Built-in Lower: " + l2);
        System.out.println("Equal? " + compare(l1,l2));
    }
}
