public class Product {
    private String productName;
    private double price;
    private int quantity;
    private final String productID;

    private static double discount = 10; 

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID; 
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void display() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            double total = price * quantity * (1 - discount / 100);
            System.out.println("Total (after " + discount + "% discount): " + total);
        }
    }

    public static void updateDiscount(double d) {
        discount = d;
    }

    public static void main(String[] args) {
        Product p1 = new Product("P01", "Laptop", 50000, 2);
        p1.display();
        System.out.println();

        Product.updateDiscount(20);
        Product p2 = new Product("P02", "Phone", 20000, 1);
        p2.display();
    }
}
