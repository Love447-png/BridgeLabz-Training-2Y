interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.1; }

    @Override
    public double calculateTax() { return getPrice() * 0.18; }

    @Override
    public String getTaxDetails() { return "18% GST"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.2; }

    @Override
    public double calculateTax() { return getPrice() * 0.05; }

    @Override
    public String getTaxDetails() { return "5% GST"; }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.05; }
}

import java.util.*;

public class TestECommerce {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("E01", "Laptop", 50000));
        products.add(new Clothing("C01", "Shirt", 2000));
        products.add(new Groceries("G01", "Rice", 1000));

        for (Product p : products) {
            double tax = (p instanceof Taxable t) ? t.calculateTax() : 0;
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println(p.getName() + " | Final Price: " + finalPrice);
        }
    }
}
