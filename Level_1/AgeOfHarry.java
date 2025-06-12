package Level_1;
import java.util.Scanner;
public class AgeOfHarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current year: ");
        int birth_year=2000;

        int current_year = sc.nextInt();

        if(current_year<birth_year) {
            System.out.println("Invalid year entered.");
        } 
        else {
            int age = current_year - birth_year;
            System.out.println("Harry's age in "+ current_year+ " is: " + age);
        }
        
        
        
        sc.close();
    }
}
