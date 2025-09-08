class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int code,String name,double p){
        itemCode=code;
        itemName=name;
        price=p;
    }

    void display(int qty){
        System.out.println("Code: "+itemCode);
        System.out.println("Name: "+itemName);
        System.out.println("Price: "+price);
        System.out.println("Total cost for "+qty+" items = "+(price*qty));
    }
}

public class ItemMain {
    public static void main(String[] args){
        Item it1=new Item(1,"Pen",10.5);
        Item it2=new Item(2,"Book",55.0);

        it1.display(3);
        it2.display(2);
    }
}
