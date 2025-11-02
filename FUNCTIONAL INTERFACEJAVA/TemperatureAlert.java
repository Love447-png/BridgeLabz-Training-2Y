
// 1. Temperature Alert System using Predicate
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> alert = temp -> temp > 40.0;
        double currentTemp = 42.5;
        if(alert.test(currentTemp))
            System.out.println("Alert! Temperature is too high.");
        else
            System.out.println("Temperature is normal.");
    }
}
