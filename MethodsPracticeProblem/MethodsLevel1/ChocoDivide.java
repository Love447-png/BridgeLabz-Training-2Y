import java.util.*;

public class ChocoDivide {
    public static int chocoPerStudent(int total, int stu){
        return total/stu;
    }
    public static int leftOver(int total, int stu){
        return total%stu;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates: ");
        int total = sc.nextInt();
        System.out.print("Enter students: ");
        int stu = sc.nextInt();
        System.out.println("Each student gets " + chocoPerStudent(total,stu));
        System.out.println("Left over = " + leftOver(total,stu));
    }
}
