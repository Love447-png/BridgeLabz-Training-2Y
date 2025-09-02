import java.util.*;
class P08_KmToMilesInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter km: ");
        double km = sc.nextDouble();
        System.out.println("Miles = " + (km * 1.6));
        sc.close();
    }
}
