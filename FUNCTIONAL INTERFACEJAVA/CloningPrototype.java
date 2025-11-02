
// 2. Cloning Prototype Objects using Cloneable
class Prototype implements Cloneable {
    int id = 1;
    String name = "Original";
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype();
        Prototype p2 = (Prototype) p1.clone();
        System.out.println("Cloned object name: " + p2.name);
    }
}
