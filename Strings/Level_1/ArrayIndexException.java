package Strings.Level_1;


import java.util.Scanner;

public class ArrayIndexException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.print("Enter the index to access: ");
        int index = sc.nextInt();

        
        handleArrayIndexException(names, index);

        sc.close();
    }

    public static void generateArrayIndexException(String[] arr, int index) {
        System.out.println("Accessed name: " + arr[index]);
    }

    public static void handleArrayIndexException(String[] arr, int index) {
        try {
            System.out.println("Accessed name: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }
    }
}

