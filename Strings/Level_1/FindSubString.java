package Strings.Level_1;

import java.util.Scanner;

public class FindSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String str = sc.next();

        System.out.print("Enter the start index: ");
        int start = sc.nextInt();

        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        String substringByCharAt = substringfind(str, start, end);
        String substringByBuiltIn = str.substring(start, end);
        boolean isSame = compareString(substringByCharAt, substringByBuiltIn);

        System.out.println("\nSubstring using charAt(): " + substringByCharAt);
        System.out.println("Substring using built-in substring(): " + substringByBuiltIn);
        System.out.println("Are both substrings equal? " + isSame);

        sc.close();
    }

    public static String substringfind(String str, int start, int end) {
        String ans = "";
        for (int i = start; i < end; i++) {
            ans += str.charAt(i);
        }
        return ans;
    }

    public static boolean compareString(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
}
