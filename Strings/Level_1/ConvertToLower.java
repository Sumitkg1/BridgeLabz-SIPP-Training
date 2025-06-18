package Strings.Level_1;

import java.util.Scanner;

public class ConvertToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String lowerByCharAt = convertToLower(text);
        String lowerByBuiltIn = text.toLowerCase();
        boolean isSame = compareStrings(lowerByCharAt, lowerByBuiltIn);

        System.out.println("Lowercase using charAt(): " + lowerByCharAt);
        System.out.println("Lowercase using built-in toLowerCase(): " + lowerByBuiltIn);
        System.out.println("Are both lowercase strings equal? " + isSame);

        sc.close();
    }

    public static String convertToLower(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}
