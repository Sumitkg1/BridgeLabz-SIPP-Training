package Strings.Level_2;
import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();

        int lengthByCharAt = findLength (str);
        int lengthByBuiltIn = str.length();

        System.out.println("Length using charAt() method: " + lengthByCharAt);
        System.out.println("Length using built-in length() method: " + lengthByBuiltIn);
        sc.close();
    }

    public static int findLength (String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
}
