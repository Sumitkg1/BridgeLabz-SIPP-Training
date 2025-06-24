package Constructors.Level_1;
public class Book {

    String title;
    String author;
    double price;
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    
     public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
     }
       public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
     public static void main(String[] args) {
        // Using default constructor
        Book book1 = new Book();
        System.out.println("Using default constructor:");
        book1.displayBookInfo();

        System.out.println(); // Just a line break

        // Using parameterized constructor
        Book book2 = new Book("life ", "sumit", 399.0);
        System.out.println("Using parameterized constructor:");
        book2.displayBookInfo();
    }
}