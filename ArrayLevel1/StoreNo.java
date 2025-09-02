import java.util.*;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double arr[] = new double[10];
        double total = 0;
        int idx = 0;

        while(true){
            System.out.print("Enter number: ");
            double val = input.nextDouble();
            if(val <= 0 || idx == 10){
                break;
            }
            arr[idx] = val;
            idx++;
        }

        System.out.println("Numbers entered:");
        for(int i=0;i<idx;i++){
            System.out.print(arr[i] + " ");
            total += arr[i];
        }
        System.out.println("\nSum = " + total);
    }
}
