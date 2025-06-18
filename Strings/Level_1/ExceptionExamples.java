package Strings.Level_1;


import java.util.Scanner;

public class ExceptionExamples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = sc.next();

        
        handle(input);


        handleillegal(input);

        sc.close();
    }

    
    public static void generate(String text) {
        
        System.out.println("Char at index beyond length: " + text.charAt(text.length()));
    }

    
    public static void handle(String text) {
        try {
            System.out.println("Char at index beyond length: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    
    public static void generateargument(String text) {
        
        System.out.println(text.substring(5, 2));
    }

    
    public static void handleillegal(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            
        }
    }
}