public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 1000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println(ownerName + " owns a " + vehicleType +
                " (Reg Fee: ₹" + registrationFee + ")");
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Asha", "Car");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1500);
        Vehicle v2 = new Vehicle("Rahul", "Bike");
        v2.displayVehicleDetails();
    }
}
