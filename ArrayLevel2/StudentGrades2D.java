import java.util.*;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int marks[][] = new int[n][3];
        double percent[] = new double[n];
        char grade[] = new char[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter physics marks: ");
            marks[i][0] = input.nextInt();
            System.out.print("Enter chemistry marks: ");
            marks[i][1] = input.nextInt();
            System.out.print("Enter maths marks: ");
            marks[i][2] = input.nextInt();
            if(marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0){
                System.out.println("Invalid marks, enter again");
                i--;
                continue;
            }
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
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
            System.out.println("P=" + marks[i][0] + " C=" + marks[i][1] + " M=" + marks[i][2] + " %=" + percent[i] + " Grade=" + grade[i]);
        }
    }
}
