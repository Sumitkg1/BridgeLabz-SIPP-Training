package StringsHandling;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Strings : ");
        String input=scanner.nextLine();
        System.out.println("String after removing duplicates: " + remove(input));

        
    }
    public static String remove(String input){
        String result = "";
        
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            boolean flag = false;

            for (int j = 0; j < result.length(); j++) {
                if (current == result.charAt(j)) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                result += current;
            }
        }

        return result;
    }

}
