import java.util.*;

public class VoteCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ages[] = new int[10];

        System.out.println("Enter age of 10 students:");
        for(int i=0;i<ages.length;i++){
            ages[i] = input.nextInt();
        }

        for(int i=0;i<ages.length;i++){
            int a = ages[i];
            if(a < 0){
                System.out.println("Invalid age " + a);
            } else if(a >= 18){
                System.out.println("Student with age " + a + " can vote");
            } else {
                System.out.println("Student with age " + a + " cannot vote");
            }
        }
    }
}
