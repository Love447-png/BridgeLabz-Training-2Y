import java.util.Scanner;

class LeapYearCheckerLogical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        if (year >= 1582) {
            boolean isLeap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
            System.out.println(isLeap ? "Leap Year" : "Not a Leap Year");
        } else {
            System.out.println("Year not in Gregorian calendar range (>= 1582)");
        }

        input.close();
    }
}
