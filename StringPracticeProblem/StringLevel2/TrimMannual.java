import java.util.*;

public class TrimManual {
    public static String myTrim(String s){
        int start=0,end=s.length()-1;
        while(start<s.length() && s.charAt(start)==' ') start++;
        while(end>=0 && s.charAt(end)==' ') end--;
        String res="";
        for(int i=start;i<=end;i++) res+=s.charAt(i);
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String t1 = myTrim(s);
        String t2 = s.trim();

        System.out.println("Manual: ["+t1+"]");
        System.out.println("Built-in: ["+t2+"]");
    }
}
