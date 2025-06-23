package StringsHandling;

public class Toggle {
    public static void main(String[] args) {
        String input = "Hello World!";
        String toggled = toggleCase(input);
        System.out.println("Original String: " + input);
        System.out.println("Toggled String: " + toggled);
    }
    public static String toggleCase(String input) {
        StringBuilder toggled = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c); 
            }
        }

        return toggled.toString();
    }
}
