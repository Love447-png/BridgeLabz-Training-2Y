
// 3. Smart Vehicle Dashboard with default method
interface VehicleDashboard {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery info not available for non-electric vehicle.");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() { System.out.println("Speed: 80 km/h"); }
    public void displayBattery() { System.out.println("Battery: 75%"); }
}

class PetrolCar implements VehicleDashboard {
    public void displaySpeed() { System.out.println("Speed: 100 km/h"); }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        VehicleDashboard v1 = new ElectricCar();
        VehicleDashboard v2 = new PetrolCar();

        v1.displaySpeed();
        v1.displayBattery();
        v2.displaySpeed();
        v2.displayBattery();
    }
}
