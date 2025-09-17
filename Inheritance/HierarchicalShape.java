class HierarchicalShape {
    void area() {
        System.out.println("Area of Shape");
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape r = new Rectangle(5, 10);
        Shape t = new Triangle(6, 8);

        r.area();
        t.area();
    }
}
