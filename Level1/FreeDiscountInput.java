import java.util.*;
public class FreeDiscountInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee = sc.nextDouble();
        double disc = sc.nextDouble();
        double discount = fee * (disc / 100.0);
        System.out.println("Final Fee = " + (fee - discount));
        sc.close();
    }
}

