// MobilePhone.java
public class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("Samsung", "Galaxy S22", 65000.0);
        MobilePhone m2 = new MobilePhone("Apple", "iPhone 14", 120000.0);

        m1.displayDetails();
        System.out.println();
        m2.displayDetails();
    }
}
