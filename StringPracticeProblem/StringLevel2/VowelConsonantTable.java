import java.util.*;

public class VowelConsonantTable {
    public static String checkType(char ch){
        char low = Character.toLowerCase(ch);
        if(low>='a' && low<='z'){
            if(low=='a'||low=='e'||low=='i'||low=='o'||low=='u') return "Vowel";
            else return "Consonant";
        } else return "Not a letter";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            System.out.println(ch + " -> " + checkType(ch));
        }
    }
}
