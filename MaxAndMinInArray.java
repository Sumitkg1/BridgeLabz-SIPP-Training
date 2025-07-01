package ReviewTest;
import java.util.*;
public class MaxAndMinInArray {
    public static void main(String[] args) {
        int[] arr = {10,15,20,14,18,25,2};
        int max= arr[0];
        int min= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum  " + max);
        System.out.println("Minimum  " + min);
    
    }
    
}
