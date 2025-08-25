import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;
        int digits = (number == 0) ? 1 : (int)Math.floor(Math.log10(Math.abs(number))) + 1;

        int n = Math.abs(number);
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        boolean isArmstrong = (sum == Math.abs(originalNumber));

        System.out.println(isArmstrong ? "Armstrong Number" : "Not an Armstrong Number");

        input.close();
    }
}
