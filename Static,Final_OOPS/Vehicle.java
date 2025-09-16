public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    private static double registrationFee = 1000;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber; 
    }

    public void display() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Reg No: " + registrationNumber);
            System.out.println("Fee: " + registrationFee);
        }
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Priya", "Car", "UP32AB1234");
        v1.display();

        Vehicle.updateRegistrationFee(1500);
        Vehicle v2 = new Vehicle("Neha", "Bike", "UP32XY5678");
        v2.display();
    }
}
