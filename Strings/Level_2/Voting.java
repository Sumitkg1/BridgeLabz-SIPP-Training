package Strings.Level_2;
import java.util.Scanner;

public class Voting{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input ages of 10 students
        System.out.println("Enter the age of 10 students:");
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + " Age: ");
            ages[i] = sc.nextInt();
        }

      
        String[][] result = checkVotingEligibility(ages);

        
        displayTable(result);

        sc.close();
    }

    
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] data = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            data[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                data[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                data[i][1] = "true"; //
            } else {
                data[i][1] = "false"; // 
            }
        }
        return data;
    }
    public static void displayTable(String[][] result) {
        System.out.println("\nAge\tCan Vote");
        System.out.println("-------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }
}
