package StringsHandling;

public class FrequentCharacter {
    public static void main(String[] args) {
        String input="success";
        char frequentChar = findFrequentChar(input);
        System.out.println("The most frequent character in the string is: " + frequentChar);
        
    }
    public static char findFrequentChar(String str) {
        
      
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int maxFreq = 0;
        char mostFreqChar = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > maxFreq) {
                maxFreq = freq[str.charAt(i)];
                mostFreqChar = str.charAt(i);
            }
        }

        return mostFreqChar;
}

    }