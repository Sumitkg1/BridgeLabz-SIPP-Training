package Strings.Level_1;

import java.util.*;

public class StringComparision {
    public static boolean compareCharAt(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.next();

        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        boolean charcompare = compareCharAt(str1, str2);
        boolean equalcompare = str1.equals(str2);

        System.out.println("\nComparison using charAt(): " + charcompare);
        System.out.println("Comparison using equals(): " + equalcompare);

         if (charcompare == equalcompare) {
            System.out.println("Both methods give the SAME result.");
        } else {
            System.out.println("The methods give DIFFERENT results.");
        }

    }

}
