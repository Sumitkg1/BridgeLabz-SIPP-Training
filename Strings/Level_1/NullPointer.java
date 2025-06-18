package Strings.Level_1;
public class NullPointer{

    public static void main(String[] args) {
        generateNullPointer();
        handleNullPointer();
    }

    public static void generateNullPointer() {
        String text = null;
        System.out.println("Calling length() on null reference...");
        System.out.println("Length: " + text.length());
    }

    public static void handleNullPointer() {
        String text = null;
        try {
            System.out.println("Attempting to call length() on null...");
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
