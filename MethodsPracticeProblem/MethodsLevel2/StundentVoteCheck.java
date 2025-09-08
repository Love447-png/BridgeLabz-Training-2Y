import java.util.*;

public class StudentVoteCheck {
    public static boolean canVote(int age){
        if(age<0) return false;
        if(age>=18) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter age: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(canVote(arr[i])){
                System.out.println("Age " + arr[i] + " can vote");
            } else {
                System.out.println("Age " + arr[i] + " cannot vote");
            }
        }
    }
}
