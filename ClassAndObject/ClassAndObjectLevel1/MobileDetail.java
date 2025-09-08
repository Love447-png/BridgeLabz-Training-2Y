class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String b,String m,double p){
        brand=b;
        model=m;
        price=p;
    }

    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
}

public class MobileMain {
    public static void main(String[] args){
        MobilePhone m1=new MobilePhone("Samsung","S21",70000);
        MobilePhone m2=new MobilePhone("Apple","iPhone 13",80000);

        m1.display();
        m2.display();
    }
}
