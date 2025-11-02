
// 2. Unit Conversion Tool
interface Converter {
    static double kmToMiles(double km) { return km * 0.621371; }
    static double kgToLbs(double kg) { return kg * 2.20462; }
}

public class UnitConversionTool {
    public static void main(String[] args) {
        System.out.println("10 km = " + Converter.kmToMiles(10) + " miles");
        System.out.println("5 kg = " + Converter.kgToLbs(5) + " lbs");
    }
}
