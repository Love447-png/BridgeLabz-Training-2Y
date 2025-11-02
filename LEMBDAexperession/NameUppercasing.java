
// Method References - Name Uppercasing
import java.util.*;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Aarohi", "Riya", "Neha", "Tanvi");

        List<String> upperNames = employees.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println("Uppercase Names:");
        upperNames.forEach(System.out::println);
    }
}
