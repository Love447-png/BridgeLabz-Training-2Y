import java.util.*;
class FeetConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = sc.nextDouble();
        System.out.println("Yards=" + (feet/3) + ", Miles=" + (feet/5280));
        sc.close();
    }
}

