import java.util.*;
class Purchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextDouble();
        int qty = sc.nextInt();
        System.out.println("Total = " + (unit*qty));
        sc.close();
    }
}

