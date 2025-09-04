import java.util.*;

public class CharArrayCheck {
    public static char[] myToCharArray(String txt){
        char arr[] = new char[txt.length()];
        for(int i=0;i<txt.length();i++){
            arr[i] = txt.charAt(i);
        }
        return arr;
    }
    public static boolean compareArrays(char[] a, char[] b){
        if(a.length != b.length) return false;
        for(int i=0;i<a.length;i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt = input.next();
        char arr1[] = myToCharArray(txt);
        char arr2[] = txt.toCharArray();
        System.out.println("Arrays equal? " + compareArrays(arr1, arr2));
    }
}
