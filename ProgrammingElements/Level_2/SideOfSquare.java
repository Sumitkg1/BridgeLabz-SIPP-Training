package ProgrammingElements.Level_2;

import java.util.Scanner;

public class SideOfSquare {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        sc.close();
    }
}

