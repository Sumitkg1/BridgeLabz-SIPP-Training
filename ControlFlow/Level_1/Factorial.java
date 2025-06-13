package ControlFlow.Level_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();
        int factorial = 1;
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
        else{
            int i=1;
            while(i <= number) {
                factorial *= i;
                i++;
            }
        }
           System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
