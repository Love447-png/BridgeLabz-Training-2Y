import java.util.*;

public class BMICalc {
    public static double findBMI(double w,double hcm){
        double hm=hcm/100.0;
        return w/(hm*hm);
    }
    public static String status(double bmi){
        if(bmi<18.5) return "Underweight";
        else if(bmi<25) return "Normal";
        else if(bmi<30) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double arr[][]=new double[10][3];
        String stat[]=new String[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter weight(kg): ");
            arr[i][0]=sc.nextDouble();
            System.out.print("Enter height(cm): ");
            arr[i][1]=sc.nextDouble();
            arr[i][2]=findBMI(arr[i][0],arr[i][1]);
            stat[i]=status(arr[i][2]);
        }
        System.out.println("Wt\tHt\tBMI\tStatus");
        for(int i=0;i<10;i++){
            System.out.println(arr[i][0]+"\t"+arr[i][1]+"\t"+String.format("%.2f",arr[i][2])+"\t"+stat[i]);
        }
    }
}
