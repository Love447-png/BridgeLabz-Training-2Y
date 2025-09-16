public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateCost() {
        return rentalDays * 1000; 
    }

    public void display() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays +
                " days. Total = ₹" + calculateCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental("Neha", "Swift", 5);
        r1.display();
    }
}
