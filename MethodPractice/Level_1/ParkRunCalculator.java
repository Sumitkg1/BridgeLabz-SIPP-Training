package MethodPractice.Level_1;

import java.util.Scanner;

public class ParkRunCalculator {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double rounds = calculateRounds(a, b, c);
        System.out.println("The athlete needs to complete " + rounds + " rounds.");
        sc.close();
    }
}
