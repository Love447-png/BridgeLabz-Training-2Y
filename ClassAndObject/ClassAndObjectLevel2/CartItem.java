public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " more " + itemName + "(s) added.");
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed.");
        } else {
            System.out.println("Cannot remove more than present in cart.");
        }
    }

    public double totalCost() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Cart Item: " + itemName);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : " + totalCost());
    }

    public static void main(String[] args) {
        CartItem c1 = new CartItem("Laptop", 50000, 1);
        c1.display();

        c1.addItem(1);
        c1.display();

        c1.removeItem(1);
        c1.display();
    }
}
