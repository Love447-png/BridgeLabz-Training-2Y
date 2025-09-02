import java.util.*;

public class FizzBuzzArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        if(n <= 0){
            System.out.println("Enter positive number");
            return;
        }
        String arr[] = new String[n+1];
        for(int i=0;i<=n;i++){
            if(i % 3 == 0 && i % 5 == 0 && i != 0){
                arr[i] = "FizzBuzz";
            } else if(i % 3 == 0 && i != 0){
                arr[i] = "Fizz";
            } else if(i % 5 == 0 && i != 0){
                arr[i] = "Buzz";
            } else {
                arr[i] = "" + i;
            }
        }
        for(int i=0;i<=n;i++){
            System.out.println("Position " + i + " = " + arr[i]);
        }
    }
}
