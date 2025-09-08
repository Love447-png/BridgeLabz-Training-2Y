import java.util.*;

public class RemoveSpaces {
    public static String noSpaces(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                res+=s.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = noSpaces(s);
        System.out.println("Without spaces: " + ans);
    }
}
