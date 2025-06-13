package ProgrammingElements.Level_1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
         double heightininches = sc.nextDouble();
         double areaininches = 0.5 * base * heightininches;
         double areainCm = areaininches * 6.4516;
         double heightinCm = heightininches * 2.54;
        double heightinFeet = heightininches / 12;
        System.out.println("Your height in CM is "+ heightinCm + " and in inches is " + areaininches);

    }
    
}
