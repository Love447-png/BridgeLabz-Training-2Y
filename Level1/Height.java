import java.util.*;
class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm = sc.nextDouble();
        double totalInches = cm / 2.54;
        int feet = (int)(totalInches / 12);
        double inches = totalInches - feet*12;
        System.out.println(feet + " feet " + inches + " inches");
        sc.close();
    }
}

