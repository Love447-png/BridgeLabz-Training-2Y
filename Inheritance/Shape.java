class Shape {
    double area;
    void displayArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    void displayCircle() {
        System.out.println("Circle Radius: " + radius);
        displayArea();
    }
}

class Cylinder extends Circle {
    double height;
    double volume;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        this.volume = Math.PI * radius * radius * height;
    }

    void displayCylinder() {
        displayCircle();
        System.out.println("Cylinder Height: " + height);
        System.out.println("Volume: " + volume);
    }

    public static void main(String[] args) {
        Cylinder cy = new Cylinder(3.0, 5.0);
        cy.displayCylinder();
    }
}
