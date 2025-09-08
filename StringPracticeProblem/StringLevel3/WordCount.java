import java.util.*;

public class WordCount {
    public static int countWords(String s){
        int c=0;
        boolean inside=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ' && !inside){
                inside=true;
                c++;
            } else if(s.charAt(i)==' '){
                inside=false;
            }
        }
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = countWords(s);
        System.out.println("Words: " + n);
    }
}
