import java.util.*;

public class ElecBill {
    public static double calcBill(int u){
        double amt=0;
        if(u<=100) amt=u*1.20;
        else if(u<=300) amt=100*1.20+(u-100)*2;
        else amt=100*1.20+200*2+(u-300)*3;
        return amt;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int u=sc.nextInt();
        double amt=calcBill(u);
        System.out.println("Bill = "+amt);
    }
}
