import java.util.*;

public class ReverseWords {
    public static String reverse(String s){
        String arr[] = s.split(" ");
        String res="";
        for(int i=arr.length-1;i>=0;i--){
            res+=arr[i];
            if(i!=0) res+=" ";
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Reversed words: " + reverse(s));
    }
}
