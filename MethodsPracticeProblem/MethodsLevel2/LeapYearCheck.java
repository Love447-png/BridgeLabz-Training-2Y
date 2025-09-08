import java.util.*;

public class LeapYearCheck {
    public static boolean isLeap(int y){
        if(y<1582) return false;
        if(y%400==0) return true;
        if(y%100==0) return false;
        if(y%4==0) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year: ");
        int y=sc.nextInt();
        if(isLeap(y)) System.out.println("Leap Year");
        else System.out.println("Not Leap Year");
    }
}
