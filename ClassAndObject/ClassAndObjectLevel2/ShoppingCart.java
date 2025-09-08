class Item {
    String name;
    int qty;
    double price;

    Item(String n,int q,double p){
        name=n;
        qty=q;
        price=p;
    }

    double cost(){
        return qty*price;
    }

    void display(){
        System.out.println(name+" x"+qty+" = "+cost());
    }
}

class ShoppingCart {
    Item items[];
    int count;

    ShoppingCart(int size){
        items=new Item[size];
        count=0;
    }

    void addItem(Item it){
        items[count++]=it;
    }

    double totalCost(){
        double t=0;
        for(int i=0;i<count;i++) t+=items[i].cost();
        return t;
    }

    void display(){
        for(int i=0;i<count;i++) items[i].display();
        System.out.println("Total = "+totalCost());
    }
}

public class CartMain {
    public static void main(String[] args){
        ShoppingCart cart=new ShoppingCart(5);
        cart.addItem(new Item("Pen",2,10.5));
        cart.addItem(new Item("Book",1,50));
        cart.addItem(new Item("Bag",1,400));
        cart.display();
    }
}
