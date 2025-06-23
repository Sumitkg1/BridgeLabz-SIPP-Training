package StringsHandling;

public class Findlarge {
    public static void main(String[] args) {
        String input = "This is a sample string with several words";
        String large = findlarge(input);
        System.out.println("The largest word is: " + large);
    }

    public static String findlarge(String input) {
        String[] words = input.split(" ");
        
        String large=words[0];

        for (String word : words) {
            if (word.length() > large.length()) {
                large= word;
            }
        }
        
        return large;
    }
}
