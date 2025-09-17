interface Light {
    void turnOnLight();
}

interface Fan {
    void turnOnFan();
}

interface Thermostat {
    void setTemperature(double temp);
}

class SmartHomeDevice implements Light, Fan, Thermostat {
    @Override
    public void turnOnLight() {
        System.out.println("Light turned ON");
    }

    @Override
    public void turnOnFan() {
        System.out.println("Fan turned ON");
    }

    @Override
    public void setTemperature(double temp) {
        System.out.println("Temperature set to " + temp + "°C");
    }

    public static void main(String[] args) {
        SmartHomeDevice d = new SmartHomeDevice();
        d.turnOnLight();
        d.turnOnFan();
        d.setTemperature(24.5);
    }
}
