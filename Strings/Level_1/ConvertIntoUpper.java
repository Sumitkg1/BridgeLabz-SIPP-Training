package Strings.Level_1;


import java.util.Scanner;

public class ConvertIntoUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String upperByCharAt = convertToUpper(text);
        String upperByBuiltIn = text.toUpperCase();
        boolean isSame = compareStrings(upperByCharAt, upperByBuiltIn);

        System.out.println("Uppercase using charAt(): " + upperByCharAt);
        System.out.println("Uppercase using built-in toUpperCase(): " + upperByBuiltIn);
        System.out.println("Are both uppercase strings equal? " + isSame);

        sc.close();
    }

    public static String convertToUpper(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
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
