// Book.java
public class Book {
    private String title;
    private String author;
    private double price;

    // default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println(title + " by " + author + " (₹" + price + ")");
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James Gosling", 500);

        b1.display();
        b2.display();
    }
}
