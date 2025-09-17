interface Reservable {
    void reserveItem();
}

abstract class LibraryItem {
    private String title;
    private String itemId;

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    public String getTitle() { return title; }
    public String getItemId() { return itemId; }

    public abstract void displayDetails();
}

class Book extends LibraryItem implements Reservable {
    public Book(String title, String id) { super(title, id); }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + getTitle() + " (" + getItemId() + ")");
    }

    @Override
    public void reserveItem() { System.out.println("Book reserved."); }
}

class Magazine extends LibraryItem {
    public Magazine(String title, String id) { super(title, id); }

    @Override
    public void displayDetails() {
        System.out.println("Magazine: " + getTitle() + " (" + getItemId() + ")");
    }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(String title, String id) { super(title, id); }

    @Override
    public void displayDetails() {
        System.out.println("DVD: " + getTitle() + " (" + getItemId() + ")");
    }

    @Override
    public void reserveItem() { System.out.println("DVD reserved."); }
}

public class TestLibrary {
    public static void main(String[] args) {
        LibraryItem l1 = new Book("Java Programming", "B01");
        LibraryItem l2 = new Magazine("Tech Today", "M05");
        LibraryItem l3 = new DVD("Inception", "D10");

        LibraryItem[] items = { l1, l2, l3 };
        for (LibraryItem li : items) {
            li.displayDetails();
            if (li instanceof Reservable r) r.reserveItem();
            System.out.println();
        }
    }
}
