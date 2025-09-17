interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleId;
    private String brand;
    private double baseRate;

    public Vehicle(String vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public String getVehicleId() { return vehicleId; }
    public String getBrand() { return brand; }
    public double getBaseRate() { return baseRate; }

    public abstract double calculateRent(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) { return getBaseRate() * days; }

    @Override
    public double calculateInsurance() { return getBaseRate() * 0.1; }

    @Override
    public String getInsuranceDetails() { return "Car Insurance 10%"; }
}
class Bike extends Vehicle {
    public Bike(String id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) { return getBaseRate() * days * 0.5; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) { return getBaseRate() * days * 2; }

    @Override
    public double calculateInsurance() { return getBaseRate() * 0.15; }

    @Override
    public String getInsuranceDetails() { return "Truck Insurance 15%"; }
}

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C1", "Honda", 1000);
        Vehicle v2 = new Bike("B1", "Yamaha", 500);
        Vehicle v3 = new Truck("T1", "Tata", 2000);

        Vehicle[] vehicles = { v1, v2, v3 };
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getBrand() + " | Rent (5 days): " + v.calculateRent(5));
            if (v instanceof Insurable i) {
                System.out.println("Insurance: " + i.calculateInsurance() + " (" + i.getInsuranceDetails() + ")");
            }
            System.out.println();
        }
    }
}
