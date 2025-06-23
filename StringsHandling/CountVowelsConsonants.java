package StringsHandling;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = scanner.nextLine().toLowerCase();
       
        int vowel = 0;
        int consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {
              
                vowel++;
            } else {
                consonants++;
            }
        }
        System.out.println("No of vowels are : "+ vowel );
        System.out.println("No of consonants are : "+ consonants);

    }

}