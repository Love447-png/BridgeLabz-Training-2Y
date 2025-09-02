import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num <= 0){
            System.out.println("Not a natural number");
            return;
        }

        int odd[] = new int[num/2 + 1];
        int even[] = new int[num/2 + 1];
        int oi = 0, ei = 0;

        for(int i=1;i<=num;i++){
            if(i % 2 == 0){
                even[ei] = i;
                ei++;
            } else {
                odd[oi] = i;
                oi++;
            }
        }

        System.out.print("Odd numbers: ");
        for(int i=0;i<oi;i++) System.out.print(odd[i] + " ");
        System.out.print("\nEven numbers: ");
        for(int i=0;i<ei;i++) System.out.print(even[i] + " ");
    }
}
