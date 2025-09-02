import java.util.*;

public class Tablefrom6to9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        int arr[] = new int[4];
        for(int i=6;i<=9;i++){
            arr[i-6] = num * i;
        }

        for(int i=6;i<=9;i++){
            System.out.println(num + " * " + i + " = " + arr[i-6]);
        }
    }
}
