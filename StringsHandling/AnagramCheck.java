package StringsHandling;
import java.util.*;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = scanner.nextLine().toLowerCase();
        System.out.println("Enter second string: ");
        String str2 = scanner.nextLine().toLowerCase();
        boolean isAnagram = checkAnagram(str1, str2);
        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }   
    }
    public static boolean checkAnagram(String s1, String s2) {
          if (s1.length() != s2.length()) return false;

        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }
}
