interface Discountable {
    double applyDiscount();
}

abstract class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public abstract void displayDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price) { super(name, price); }

    @Override
    public void displayDetails() {
        System.out.println("Veg: " + getName() + " | Price: " + getPrice());
    }

    @Override
    public double applyDiscount() { return getPrice() * 0.9; } // 10% off
}

class NonVegItem extends FoodItem {
    public NonVegItem(String name, double price) { super(name, price); }

    @Override
    public void displayDetails() {
        System.out.println("Non-Veg: " + getName() + " | Price: " + getPrice());
    }
}

public class TestFood {
    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer Curry", 200);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 300);

        FoodItem[] foods = { f1, f2 };
        for (FoodItem f : foods) {
            f.displayDetails();
            if (f instanceof Discountable d) {
                System.out.println("Discounted Price: " + d.applyDiscount());
            }
            System.out.println();
        }
    }
}
