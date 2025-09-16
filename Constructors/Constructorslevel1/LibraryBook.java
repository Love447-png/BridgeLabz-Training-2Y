public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed.");
        } else {
            System.out.println(title + " not available.");
        }
    }

    public void display() {
        System.out.println(title + " by " + author + " (₹" + price + ") " +
                (available ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Python Pro", "Guido", 400);
        b1.display();
        b1.borrowBook();
        b1.display();
    }
}
