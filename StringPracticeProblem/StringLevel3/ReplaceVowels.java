import java.util.*;

public class ReplaceVowels {
    public static String replace(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char low = Character.toLowerCase(ch);
            if(low=='a'||low=='e'||low=='i'||low=='o'||low=='u'){
                res+='*';
            } else {
                res+=ch;
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("After replace: " + replace(s));
    }
}
