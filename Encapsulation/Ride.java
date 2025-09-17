interface GPS {
    void updateLocation(String location);
}

abstract class Vehicle {
    private String id;
    private String driver;

    public Vehicle(String id, String driver) {
        this.id = id;
        this.driver = driver;
    }

    public String getId() { return id; }
    public String getDriver() { return driver; }

    public abstract void displayDetails();
}
class Car extends Vehicle implements GPS {
    public Car(String id, String driver) { super(id, driver); }

    @Override
    public void displayDetails() {
        System.out.println("Car Driver: " + getDriver());
    }

    @Override
    public void updateLocation(String location) {
        System.out.println("Car location updated to: " + location);
    }
}

class Bike extends Vehicle {
    public Bike(String id, String driver) { super(id, driver); }

    @Override
    public void displayDetails() {
        System.out.println("Bike Driver: " + getDriver());
    }
}

class Auto extends Vehicle implements GPS {
    public Auto(String id, String driver) { super(id, driver); }

    @Override
    public void displayDetails() {
        System.out.println("Auto Driver: " + getDriver());
    }

    @Override
    public void updateLocation(String location) {
        System.out.println("Auto location updated to: " + location);
    }
}

public class TestRide {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", "Asha");
        Vehicle v2 = new Bike("B202", "Ravi");
        Vehicle v3 = new Auto("A303", "Vikram");

        Vehicle[] rides = { v1, v2, v3 };
        for (Vehicle v : rides) {
            v.displayDetails();
            if (v instanceof GPS g) g.updateLocation("Downtown");
            System.out.println();
        }
    }
}
