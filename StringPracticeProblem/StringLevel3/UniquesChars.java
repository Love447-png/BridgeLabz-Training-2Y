import java.util.*;

public class UniqueChars {
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
    public static char[] unique(String s){
        int n = myLength(s);
        char arr[] = new char[n];
        int k=0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            boolean found = false;
            for(int j=0;j<i;j++){
                if(s.charAt(j)==ch){
                    found=true; break;
                }
            }
            if(!found){
                arr[k++]=ch;
            }
        }
        char res[] = new char[k];
        for(int i=0;i<k;i++) res[i]=arr[i];
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        char res[] = unique(txt);
        System.out.print("Unique: ");
        for(char c:res) System.out.print(c+" ");
    }
}
