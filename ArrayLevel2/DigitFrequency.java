import java.util.*;

public class DigitFreq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int temp = n, count = 0;
        while(temp > 0){
            count++;
            temp = temp / 10;
        }
        int digits[] = new int[count];
        temp = n;
        for(int i=0;i<count;i++){
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        int freq[] = new int[10];
        for(int i=0;i<count;i++){
            freq[digits[i]]++;
        }
        for(int i=0;i<10;i++){
            if(freq[i] > 0){
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }
    }
}
