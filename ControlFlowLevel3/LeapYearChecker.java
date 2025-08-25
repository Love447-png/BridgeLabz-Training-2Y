import java.util.Scanner;

class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year < 1582) {
            System.out.println("Year not in Gregorian calendar range (>= 1582)");
        } else {
            boolean isLeap;
            if (year % 400 == 0) {
                isLeap = true;
            } else if (year % 100 == 0) {
                isLeap = false;
            } else if (year % 4 == 0) {
                isLeap = true;
            } else {
                isLeap = false;
            }

            System.out.println(isLeap ? "Leap Year" : "Not a Leap Year");
        }

        input.close();
    }
}
