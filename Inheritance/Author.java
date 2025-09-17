class Author {
    String name;
    String email;

    Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void displayAuthor() {
        System.out.println("Author: " + name + ", Email: " + email);
    }
}

class Book extends Author {
    String title;
    double price;

    Book(String name, String email, String title, double price) {
        super(name, email);
        this.title = title;
        this.price = price;
    }

    void displayBook() {
        displayAuthor();
        System.out.println("Book: " + title + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book("James Gosling", "james@java.com", "Java Basics", 500);
        b.displayBook();
    }
}
