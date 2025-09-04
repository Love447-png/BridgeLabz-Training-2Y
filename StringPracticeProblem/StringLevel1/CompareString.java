import java.util.*;

public class CompareString {
    public static boolean compareByCharAt(String a, String b){
        if(a.length() != b.length()) return false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) != b.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = input.next();
        System.out.print("Enter second string: ");
        String s2 = input.next();

        boolean res1 = compareByCharAt(s1, s2);
        boolean res2 = s1.equals(s2);

        System.out.println("Compare by charAt: " + res1);
        System.out.println("Compare by equals: " + res2);
    }
}
