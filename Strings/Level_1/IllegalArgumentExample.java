package Strings.Level_1;
import java.util.Scanner;

public class IllegalArgumentExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        handleIllegalArgument(input);
        sc.close();
    }

    public static void generateIllegalArgument(String text) {
        System.out.println("Substring (5, 2): " + text.substring(5, 2));
    }

    public static void handleIllegalArgument(String text) {
        try {
            System.out.println("Substring (5, 2): " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }
    }
}

