package Constructors.Level_1;

public class LibrarySystem {
    

    String title;
    String author;
    double price;
    boolean isAvailable;

    public LibrarySystem(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully: " + title);
        } else {
            System.out.println("Sorry, the book is currently not available.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        LibrarySystem book1 = new LibrarySystem("ABC", "Sumit", 200.0, true);

        book1.displayDetails();
        System.out.println();
        book1.borrowBook();
        book1.borrowBook(); // Attempt to borrow again
    }
}

