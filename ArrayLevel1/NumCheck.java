import java.util.*;

public class NumCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 numbers:");
        for(int i=0;i<5;i++){
            arr[i] = input.nextInt();
        }

        for(int i=0;i<5;i++){
            int n = arr[i];
            if(n > 0){
                if(n % 2 == 0){
                    System.out.println(n + " is positive even");
                } else {
                    System.out.println(n + " is positive odd");
                }
            } else if(n < 0){
                System.out.println(n + " is negative");
            } else {
                System.out.println("zero");
            }
        }
        int first = arr[0];
        int last = arr[arr.length-1];
        if(first == last){
            System.out.println("First and last are equal");
        } else if(first > last){
            System.out.println("First is greater than last");
        } else {
            System.out.println("First is smaller than last");
        }
    }
}
