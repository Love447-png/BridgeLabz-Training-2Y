import java.util.*;

public class TableProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        int mul[] = new int[10];
        for(int i=0;i<10;i++){
            mul[i] = num * (i+1);
        }

        for(int i=0;i<10;i++){
            System.out.println(num + " * " + (i+1) + " = " + mul[i]);
        }
    }
}
