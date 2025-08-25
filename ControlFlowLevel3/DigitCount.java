import java.util.Scanner;

class DigitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        if (number == 0) {
            System.out.println(1);
            input.close();
            return;
        }

        int count = 0;
        int n = Math.abs(number); 

        while (n != 0) {
            n /= 10;
            count++;
        }

        System.out.println(count);
        input.close();
    }
}
