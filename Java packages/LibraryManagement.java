
// 5. Real-Life Scenario - Library Management System

package library.books;
public class Book {
    public String title;
    public Book(String title) { this.title = title; }
    public void display() { System.out.println("Book: " + title); }
}

package library.members;
public class Member {
    public String name;
    public Member(String name) { this.name = name; }
    public void display() { System.out.println("Member: " + name); }
}

package library.transactions;
import library.books.Book;
import library.members.Member;

public class Transaction {
    public void issue(Book b, Member m) {
        System.out.println(m.name + " issued " + b.title);
    }
}

// Main Class
import library.books.*;
import library.members.*;
import library.transactions.*;

public class LibraryManagement {
    public static void main(String[] args) {
        Book b = new Book("Java Programming");
        Member m = new Member("Aarohi");
        Transaction t = new Transaction();

        b.display();
        m.display();
        t.issue(b, m);
    }
}
