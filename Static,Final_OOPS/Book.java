public class Book {
    private String title;
    private String author;
    private final String isbn;

    private static String libraryName = "City Library";

    public Book(String title, String author, String isbn) {
        this.title = title;   
        this.author = author;
        this.isbn = isbn;     
    }

    public void display() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN101");
        Book b2 = new Book("Python Pro", "Guido", "ISBN102");

        b1.display();
        System.out.println();
        b2.display();
    }
}
