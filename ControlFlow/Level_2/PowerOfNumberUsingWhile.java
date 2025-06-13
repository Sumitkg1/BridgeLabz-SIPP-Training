package ControlFlow.Level_2;

import java.util.Scanner;

public class PowerOfNumberUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Power must be a non-negative integer.");
        } else {
            int result = 1;
            int counter = 0;

            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println(number + " raised to power " + power + " is: " + result);
        }
    }
}

