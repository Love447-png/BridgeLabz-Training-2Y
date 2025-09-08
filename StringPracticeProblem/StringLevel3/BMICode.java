import java.util.*;

public class BMICode {
    public static double findBMI(double w, double h){
        double hm = h/100.0; 
        return w / (hm*hm);
    }

    public static String getStatus(double bmi){
        if(bmi < 18.5) return "Underweight";
        else if(bmi < 25) return "Normal";
        else if(bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double data[][] = new double[10][2];

        for(int i=0;i<10;i++){
            System.out.print("Weight(kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height(cm): ");
            data[i][1] = sc.nextDouble();
        }

        System.out.println("Wt\tHt\tBMI\tStatus");
        for(int i=0;i<10;i++){
            double bmi = findBMI(data[i][0], data[i][1]);
            String status = getStatus(bmi);
            System.out.println(data[i][0]+"\t"+data[i][1]+"\t"+String.format("%.2f",bmi)+"\t"+status);
        }
    }
}
