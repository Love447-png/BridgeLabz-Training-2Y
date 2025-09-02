import java.util.*;

public class BMIin2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double personData[][] = new double[n][3];
        String status[] = new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter weight for person " + (i+1) + ": ");
            double w = sc.nextDouble();
            System.out.print("Enter height (m): ");
            double h = sc.nextDouble();
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h*h);
            if(personData[i][2] < 18.5){
                status[i] = "Underweight";
            } else if(personData[i][2] < 25){
                status[i] = "Normal";
            } else if(personData[i][2] < 30){
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("Height: " + personData[i][1] + " Weight: " + personData[i][0] + " BMI: " + personData[i][2] + " Status: " + status[i]);
        }
    }
}
