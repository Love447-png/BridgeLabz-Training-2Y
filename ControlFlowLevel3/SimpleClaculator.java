import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next().trim(); // "+", "-", "*", "/"

        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println(result);
                break;
            case "-":
                result = first - second;
                System.out.println(result);
                break;
            case "*":
                result = first * second;
                System.out.println(result);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Division by zero error");
                } else {
                    result = first / second;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
