import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary[] = new double[10];
        int years[] = new int[10];
        double bonus[] = new double[10];
        double newSal[] = new double[10];

        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for(int i=0;i<10;i++){
            System.out.print("Enter salary of emp " + (i+1) + ": ");
            double s = input.nextDouble();
            System.out.print("Enter years of service: ");
            int y = input.nextInt();

            if(s < 0 || y < 0){
                System.out.println("Invalid, enter again");
                i--; 
                continue;
            }
            salary[i] = s;
            years[i] = y;
            if(y > 5){
                bonus[i] = s * 0.05;
            } else {
                bonus[i] = s * 0.02;
            }
            newSal[i] = s + bonus[i];
            totalBonus += bonus[i];
            totalOld += s;
            totalNew += newSal[i];
        }
        System.out.println("\nTotal Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);
    }
}
