class Circle {
    double radius;

    Circle(double r){
        radius=r;
    }

    double area(){
        return 3.14*radius*radius;
    }

    double circumference(){
        return 2*3.14*radius;
    }

    void display(){
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+area());
        System.out.println("Circumference: "+circumference());
    }
}

public class CircleMain {
    public static void main(String[] args){
        Circle c1=new Circle(5);
        c1.display();
    }
}
