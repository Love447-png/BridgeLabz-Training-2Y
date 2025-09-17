
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Model: " + model);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar("Tesla", "Model 3", 75);
        e.display();
    }
}
