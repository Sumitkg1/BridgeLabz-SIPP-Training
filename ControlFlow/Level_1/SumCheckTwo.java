package ControlFlow.Level_1;

import java.util.Scanner;

public class SumCheckTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sum = n * (n + 1) / 2;
            int sum_2 = 0;

            for (int i = 1; i <= n; i++) {
                sum_2 += i;
            }

            System.out.println("Sum using formula: " + sum);
            System.out.println("Sum using for loop: " + sum_2);

            if (sum == sum_2) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("Mismatch in results.");
            }
        }

    }
}