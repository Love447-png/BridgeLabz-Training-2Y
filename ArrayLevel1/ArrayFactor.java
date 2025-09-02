import java.util.*;

public class ArrayFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int max = 10;
        int factors[] = new int[max];
        int idx = 0;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                if(idx == max){
                    max = max * 2;
                    int temp[] = new int[max];
                    for(int j=0;j<factors.length;j++){
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[idx] = i;
                idx++;
            }
        }
        System.out.println("Factors:");
        for(int i=0;i<idx;i++){
            System.out.print(factors[i] + " ");
        }
    }
}
