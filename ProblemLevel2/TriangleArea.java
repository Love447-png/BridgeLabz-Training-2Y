import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        
        double areaSqCm = 0.5 * base * height;

        
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
    }
}
