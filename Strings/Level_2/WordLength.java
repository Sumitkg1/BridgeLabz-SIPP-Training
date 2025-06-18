package Strings.Level_2;
import java.util.Scanner;

public class WordLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordLengthArray = getWord(words);
        int[] resultIndexes = find(wordLengthArray);

        System.out.println("\nWord\tLength");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        System.out.println("\nShortest Word: " + wordLengthArray[resultIndexes[0]][0]);
        System.out.println("Longest Word: " + wordLengthArray[resultIndexes[1]][0]);

        sc.close();
    }

    public static String[] splitWords(String text) {
        int spaceCount = 0;
        for (int i = 0;; i++) {
            try {
                if (text.charAt(i) == ' ') spaceCount++;
            } catch (Exception e) {
                break;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        String word = "";

        for (int i = 0;; i++) {
            try {
                char ch = text.charAt(i);
                if (ch == ' ') {
                    words[wordIndex++] = word;
                    word = "";
                } else {
                    word += ch;
                }
            } catch (Exception e) {
                words[wordIndex] = word;
                break;
            }
        }

        return words;
    }

    public static int getLength(String word) {
        int count = 0;
        while (true) {
            try {
                word.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    public static String[][] getWord(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static int[] find(String[][] wordLengthArray) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < wordLengthArray.length; i++) {
            int len = Integer.parseInt(wordLengthArray[i][1]);
            int minLen = Integer.parseInt(wordLengthArray[minIndex][1]);
            int maxLen = Integer.parseInt(wordLengthArray[maxIndex][1]);

            if (len < minLen) {
                minIndex = i;
            }
            if (len > maxLen) {
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }
}

