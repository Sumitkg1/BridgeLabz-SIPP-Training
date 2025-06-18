package Strings.Level_2;

import java.util.Scanner;

public class TrimSpaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        int[] trimIndexes = find(input);
        String trimmedByCharAt = customSubstring(input, trimIndexes[0], trimIndexes[1]);
        String trimmedByBuiltIn = input.trim();

        boolean isSame = compareStrings(trimmedByCharAt, trimmedByBuiltIn);

        System.out.println("Trimmed using charAt(): '" + trimmedByCharAt + "'");
        System.out.println("Trimmed using built-in trim(): '" + trimmedByBuiltIn + "'");
        System.out.println("Are both results equal? " + isSame);
    }

    public static int[] find(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; 
    }

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
}

