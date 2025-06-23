package StringsHandling;

public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Hello World!";
        char ch = 'o';
        String result = removeCharacter(input, ch);
        System.out.println("Original String: " + input);
        System.out.println("String after removing '" + ch + "': " + result);
    }

    public static String removeCharacter(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}