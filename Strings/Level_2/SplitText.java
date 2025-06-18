package Strings.Level_2;
import java.util.Scanner;

public class SplitText{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] wordsByCustom = split(text);
        String[] wordsByBuiltIn = text.split(" ");
        
        boolean areEqual = compare(wordsByCustom, wordsByBuiltIn);

        System.out.println("\nWords using custom method:");
        for (String word : wordsByCustom) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : wordsByBuiltIn) {
            System.out.println(word);
        }

        System.out.println("\nAre both methods producing same result? " + areEqual);
        sc.close();
    }

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] split(String str) {
        int length = findLength(str);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] space  = new int[spaceCount + 2];
        space [0] = -1;
        int idx = 1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                space [idx++] = i;
            }
        }

        space [idx] = length;

        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = space [i] + 1; j < space [i + 1]; j++) {
                word += str.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    public static boolean compare(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }

        return true;
    }
}

