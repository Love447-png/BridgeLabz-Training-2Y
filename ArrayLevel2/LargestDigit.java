import java.util.*;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int maxDigit = 10;
        int digits[] = new int[maxDigit];
        int idx = 0;
        while(num > 0 && idx < maxDigit){
            digits[idx] = num % 10;
            num = num / 10;
            idx++;
        }
        int first = 0, second = 0;
        for(int i=0;i<idx;i++){
            if(digits[i] > first){
                second = first;
                first = digits[i];
            } else if(digits[i] > second && digits[i] != first){
                second = digits[i];
            }
        }
        System.out.println("Largest digit = " + first);
        System.out.println("Second Largest digit = " + second);
    }
}
