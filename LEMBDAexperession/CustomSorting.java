
// Lambda Expressions - Custom Sorting in E-Commerce
import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class CustomSorting {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 60000, 4.5, 10));
        products.add(new Product("Laptop", 90000, 4.7, 15));
        products.add(new Product("Tablet", 30000, 4.2, 5));

        System.out.println("Sort by Price:");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);

        System.out.println("\nSort by Discount:");
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        products.forEach(System.out::println);
    }
}
