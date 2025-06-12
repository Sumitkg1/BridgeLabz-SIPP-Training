package Day_1.Level_1;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightincm = sc.nextDouble();

        double inchesfromcm = heightincm / 2.54;
        double feet = (inchesfromcm / 12);
        double inches = inchesfromcm % 12;

        System.out.println("Your Height in cm is " + heightincm + " while in feet is " + feet + " and inches is " + inches);

        sc.close();
    }
}
 