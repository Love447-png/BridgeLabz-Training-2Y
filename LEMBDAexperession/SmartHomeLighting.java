
// Lambda Expressions - Smart Home Lighting Automation
import java.util.*;

interface LightAction {
    void activate();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Lights turned ON due to motion.");
        LightAction timeTrigger = () -> System.out.println("Lights dimmed for evening mode.");
        LightAction voiceTrigger = () -> System.out.println("Lights turned OFF by voice command.");

        motionTrigger.activate();
        timeTrigger.activate();
        voiceTrigger.activate();
    }
}
