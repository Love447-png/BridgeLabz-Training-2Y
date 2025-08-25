import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int n = Math.abs(number);
        int sum = 0, temp = n;
        while (temp != 0) {
            sum += (temp % 10);
            temp /= 10;
        }
        if (sum == 0) {
            System.out.println("Not a Harshad Number");
        } else {
            boolean isHarshad = (n % sum == 0);
            System.out.println(isHarshad ? "Harshad Number" : "Not a Harshad Number");
        }

        input.close();
    }
}
