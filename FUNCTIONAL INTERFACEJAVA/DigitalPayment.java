
// 3. Digital Payment Interface
interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via UPI"); }
}

class CreditCard implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via Credit Card"); }
}

class Wallet implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via Wallet"); }
}

public class DigitalPayment {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(500);
    }
}
