package MethodPractice.Level_2;

import java.util.Scanner;

public class NaturalNumber {
     public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Enter a natural number (positive integer)");
        } else {
            int recSum = recursiveSum(n);
            int formSum = formulaSum(n);

            System.out.println(recSum);
            System.out.println(formSum);

            if (recSum == formSum) {
                System.out.println("Both methods return the same result.");
            } else {
                System.out.println("Mismatch in results.");
            }
        }

        scanner.close();
    }
}
