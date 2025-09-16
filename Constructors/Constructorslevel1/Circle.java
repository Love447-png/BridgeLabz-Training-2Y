public class Circle {
    private double radius;

    public Circle() {
        this(1.0); 
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Circle radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        c1.display();
        c2.display();
    }
}
