package Constructors.Level_1;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookDetails() {
        System.out.println("EBook ISBN (public): " + ISBN);
        System.out.println("EBook Title (protected): " + title);
        System.out.println("File Size: " + fileSizeMB + " MB");
        System.out.println("Author (via getter): " + getAuthor());
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("111-222-333", "Java Basics", "Sumit Kumar");
        book.displayBookDetails();

        System.out.println();

        EBook ebook = new EBook("444-555-666", "Advanced Java", "Anjali Mehta", 3.2);
        ebook.displayEBookDetails();
    }
}
