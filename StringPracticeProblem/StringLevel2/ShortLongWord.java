import java.util.*;

public class ShortLongWord {
    public static String[] mySplit(String s){
        ArrayList<String> list = new ArrayList<>();
        String t="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(!t.equals("")) list.add(t);
                t="";
            } else t+=s.charAt(i);
        }
        if(!t.equals("")) list.add(t);
        return list.toArray(new String[0]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String words[] = mySplit(line);

        String min = words[0], max = words[0];
        for(String w: words){
            if(w.length()<min.length()) min=w;
            if(w.length()>max.length()) max=w;
        }
        System.out.println("Shortest = " + min);
        System.out.println("Longest = " + max);
    }
}
