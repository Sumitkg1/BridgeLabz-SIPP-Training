package Level_1;
import java.util.Scanner;
public class CalculateAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks in Maths, Physics and Chemistry: ");
        int maths= sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        double average= (maths + physics + chemistry) / 3.0;
        System.out.println("Sam's average marks in PCM is : " + average);
        sc.close();
        
    }
}