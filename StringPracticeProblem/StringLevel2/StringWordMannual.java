import java.util.*;

public class SplitWordsManual {
    public static String[] mySplit(String s){
        int spaces = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') spaces++;
        }
        String arr[] = new String[spaces];
        String temp = "";
        int idx = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                arr[idx++] = temp;
                temp="";
            } else {
                temp += s.charAt(i);
            }
        }
        arr[idx] = temp;
        return arr;
    }

    public static boolean compare(String[] a,String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String arr1[] = mySplit(line);
        String arr2[] = line.split(" ");

        System.out.println("Equal? " + compare(arr1,arr2));
    }
}
