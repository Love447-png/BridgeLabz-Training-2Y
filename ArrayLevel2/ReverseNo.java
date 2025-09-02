import java.util.*;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int temp = n, count = 0;
        while(temp > 0){
            count++;
            temp = temp / 10;
        }
        int arr[] = new int[count];
        temp = n;
        for(int i=0;i<count;i++){
            arr[i] = temp % 10;
            temp = temp / 10;
        }
        System.out.print("Reversed number: ");
        for(int i=0;i<count;i++){
            System.out.print(arr[i]);
        }
    }
}
