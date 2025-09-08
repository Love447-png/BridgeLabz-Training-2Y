import java.util.*;

public class CharFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int freq[] = new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }
}
