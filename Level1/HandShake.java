import java.util.*;
class HandShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Handshakes = " + (n*(n-1)/2));
        sc.close();
    }
}

