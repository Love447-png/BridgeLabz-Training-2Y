import java.util.*;

public class BMIArray {
    public static double bmi(double w,double hcm){
        double hm=hcm/100.0;
        return w/(hm*hm);
    }
    public static String status(double b){
        if(b<18.5) return "Underweight";
        else if(b<25) return "Normal";
        else if(b<30) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double arr[][]=new double[10][2];
        for(int i=0;i<10;i++){
            arr[i][0]=sc.nextDouble();
            arr[i][1]=sc.nextDouble();
        }
        for(int i=0;i<10;i++){
            double b=bmi(arr[i][0],arr[i][1]);
            System.out.println(arr[i][0]+" "+arr[i][1]+" "+String.format("%.2f",b)+" "+status(b));
        }
    }
}
