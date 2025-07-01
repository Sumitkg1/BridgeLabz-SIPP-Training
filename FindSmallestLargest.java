package ReviewTest;
import java.util.*;
public class FindSmallestLargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Strings : ");
        String str=scanner.nextLine();
        String array[] = str.split(" ");
        String small = array[0];
        String large = array[0];
        for (String s1 : array) {
            

            if (s1.length() < small.length()) {
                small = s1;
            }
            if (s1.length() > large.length()) {
                large = s1;
            }
            

        }
        System.out.println("Smallest String : " + small);
        System.out.println("Largest String : " + large);
    }
}
