 public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

        public void display() {
        System.out.printf("Circle (radius = %.2f)\n", radius);
        System.out.printf("Area          : %.4f\n", getArea());
        System.out.printf("Circumference : %.4f\n", getCircumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle(3.5);
        c.display();
    }
}
