import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int phy[] = new int[n];
        int chem[] = new int[n];
        int math[] = new int[n];
        double percent[] = new double[n];
        char grade[] = new char[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter physics marks: ");
            int p = input.nextInt();
            System.out.print("Enter chemistry marks: ");
            int c = input.nextInt();
            System.out.print("Enter maths marks: ");
            int m = input.nextInt();
            if(p < 0 || c < 0 || m < 0){
                System.out.println("Invalid marks, enter again");
                i--;
                continue;
            }
            phy[i] = p; chem[i] = c; math[i] = m;
            percent[i] = (p+c+m)/3.0;
            if(percent[i] >= 90){
                grade[i] = 'A';
            } else if(percent[i] >= 75){
                grade[i] = 'B';
            } else if(percent[i] >= 60){
                grade[i] = 'C';
            } else if(percent[i] >= 40){
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("P=" + phy[i] + " C=" + chem[i] + " M=" + math[i] + " %=" + percent[i] + " Grade=" + grade[i]);
        }
    }
}
