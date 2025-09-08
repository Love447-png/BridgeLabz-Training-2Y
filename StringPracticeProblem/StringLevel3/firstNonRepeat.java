import java.util.*;

public class FirstNonRepeat {
    public static char firstNonRepeat(String s){
        int freq[] = new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)]==1) return s.charAt(i);
        }
        return '\0';
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ans = firstNonRepeat(s);
        if(ans=='\0') System.out.println("No non-repeating char");
        else System.out.println("First non-repeating: " + ans);
    }
}
