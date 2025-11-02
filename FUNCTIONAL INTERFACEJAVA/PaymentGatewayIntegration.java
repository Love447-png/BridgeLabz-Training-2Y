
// 1. Payment Gateway Integration with default refund method
interface PaymentProcessor {
    void pay(double amount);
    default void refund(double amount) {
        System.out.println("Refunded amount: " + amount);
    }
}

class Paytm implements PaymentProcessor {
    public void pay(double amount) { System.out.println("Paid via Paytm: " + amount); }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor paytm = new Paytm();
        paytm.pay(1000);
        paytm.refund(500);
    }
}
