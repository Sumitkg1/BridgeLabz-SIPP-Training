package MethodPractice.Level_1;

import java.util.Scanner;

public class SumOfNaturalNumber {
     public static int sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sumN(n);
        System.out.println("Sum of first " + n + " natural numbers: " + result);
        sc.close();
    }
}
