package StringsHandling;

public class SubstringCount {
    public static void main(String[] args) {
        String input = "This is a sample string with several words";
        String substring = "is";
        int count = countSubstring(input, substring);
        System.out.println("The substring '" + substring + "' appears " + count + " times in the input string.");

    }
    public static int countSubstring(String input, String substring) {
        int count = 0;
        int index = 0;

        while ((index = input.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); 
        }

        return count;
    }
}
