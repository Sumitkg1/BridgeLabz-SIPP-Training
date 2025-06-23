package Strings.Level_1;

import java.util.Scanner;


public class CharArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] customArray = convertArray(input);
        char[] builtInArray = input.toCharArray();

        boolean isEqual = compareArrays(customArray, builtInArray);

        System.out.print("Custom char array: ");
        printArray(customArray);

        System.out.print("Built-in char array: ");
        printArray(builtInArray);

        System.out.println("Are both arrays equal? " + isEqual);

        sc.close();
    }

    public static char[] convertArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void printArray(char[] arr) {
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
