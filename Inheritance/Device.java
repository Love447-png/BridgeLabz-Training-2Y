class Device {
    String deviceName;
    String status;

    Device(String deviceName, String status) {
        this.deviceName = deviceName;
        this.status = status;
    }

    void displayDevice() {
        System.out.println("Device: " + deviceName + " | Status: " + status);
    }
}

class Thermostat extends Device {
    double temperature;

    Thermostat(String deviceName, String status, double temperature) {
        super(deviceName, status);
        this.temperature = temperature;
    }

    void displayThermostat() {
        displayDevice();
        System.out.println("Temperature: " + temperature + "°C");
    }

    public static void main(String[] args) {
        Thermostat t = new Thermostat("Smart Thermostat", "ON", 22.5);
        t.displayThermostat();
    }
}
