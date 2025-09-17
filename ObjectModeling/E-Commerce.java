import java.util.*;

class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name; this.price = price;
    }
}

class Order {
    List<Product> products = new ArrayList<>();
    public void addProduct(Product p) { products.add(p); }
    public void showOrder() {
        System.out.println("Order contains:");
        for (Product p : products) System.out.println(" - " + p.name + " : " + p.price);
    }
}

class Customer {
    String name;
    public Customer(String name) { this.name = name; }
    public void placeOrder(Order o) {
        System.out.println(name + " placed an order.");
        o.showOrder();
    }
}

public class TestECommerce {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 20000);

        Order o = new Order();
        o.addProduct(p1);
        o.addProduct(p2);

        Customer c = new Customer("Neha");
        c.placeOrder(o);
    }
}
