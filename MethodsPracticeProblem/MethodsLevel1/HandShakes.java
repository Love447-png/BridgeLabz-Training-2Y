import java.util.*;

public class Handshakes {
    public static int findHandshakes(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        int h = findHandshakes(n);
        System.out.println("Max handshakes: " + h);
    }
}
