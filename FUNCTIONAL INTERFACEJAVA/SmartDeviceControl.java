
// 1. Smart Device Control Interface
interface Device {
    void turnOn();
    void turnOff();
}

class Light implements Device {
    public void turnOn() { System.out.println("Light is ON"); }
    public void turnOff() { System.out.println("Light is OFF"); }
}

class AC implements Device {
    public void turnOn() { System.out.println("AC is ON"); }
    public void turnOff() { System.out.println("AC is OFF"); }
}

class TV implements Device {
    public void turnOn() { System.out.println("TV is ON"); }
    public void turnOff() { System.out.println("TV is OFF"); }
}

public class SmartDeviceControl {
    public static void main(String[] args) {
        Device d1 = new Light();
        Device d2 = new AC();
        Device d3 = new TV();

        d1.turnOn(); d2.turnOn(); d3.turnOff();
    }
}
