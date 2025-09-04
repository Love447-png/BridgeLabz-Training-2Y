import java.util.*;

public class SubStringCheck {
    public static String makeSub(String txt, int start, int end){
        String sub = "";
        for(int i=start;i<end;i++){
            sub += txt.charAt(i);
        }
        return sub;
    }

    public static boolean compareStrings(String a, String b){
        if(a.length() != b.length()) return false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner inpug = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.next();
        System.out.print("Enter start index: ");
        int s = input.nextInt();
        System.out.print("Enter end index: ");
        int e = input.nextInt();

        String sub1 = makeSub(text,s,e);
        String sub2 = text.substring(s,e);

        System.out.println("User Substring: " + sub1);
        System.out.println("Built-in Substring: " + sub2);
        System.out.println("Equal? " + compareStrings(sub1,sub2));
    }
}