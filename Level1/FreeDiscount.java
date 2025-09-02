public class FreeDiscount {
    public static void main(String[] args) {
        int fee = 125000;
        double discount = fee * 0.10;
        double finalFee = fee - discount;
        System.out.println("Discount = " + discount + ", Final Fee = " + finalFee);
    }
}
