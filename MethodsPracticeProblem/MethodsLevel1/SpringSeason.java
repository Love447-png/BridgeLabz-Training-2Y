import java.util.*;

public class SpringSeason {
    public static boolean isSpring(int m, int d){
        if(m==3 && d>=20) return true;
        if(m>3 && m<6) return true;
        if(m==6 && d<=20) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Month: ");
        int m = sc.nextInt();
        System.out.print("Day: ");
        int d = sc.nextInt();
        if(isSpring(m,d)) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
    }
}
