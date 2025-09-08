import java.util.*;

public class WordsWithLength {
    public static int myLength(String s){
        int c=0;
        try{
            while(true){
                s.charAt(c);
                c++;
            }
        } catch(Exception e){}
        return c;
    }

    public static String[] mySplit(String s){
        int spaces=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') spaces++;
        }
        String arr[] = new String[spaces];
        String temp="";
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                arr[idx++]=temp;
                temp="";
            } else temp+=s.charAt(i);
        }
        arr[idx]=temp;
        return arr;
    }

    public static String[][] wordAndLength(String[] words){
        String out[][] = new String[words.length][2];
        for(int i=0;i<words.length;i++){
            out[i][0] = words[i];
            out[i][1] = String.valueOf(myLength(words[i]));
        }
        return out;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String words[] = mySplit(line);
        String res[][] = wordAndLength(words);

        for(int i=0;i<res.length;i++){
            System.out.println(res[i][0]+" -> "+res[i][1]);
        }
    }
}
