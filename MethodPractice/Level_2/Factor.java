package MethodPractice.Level_2;

import java.util.Scanner;

public class Factor {
    

    public static int[] findFactors(int num) {


        
        int count = 0;
        
        
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }




        
        
        
        int[] factors = new int[count];
        
        
        
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long productFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] factors = findFactors(number);

        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println(sumFactors(factors));
        System.out.println(productFactors(factors));
        System.out.println(sumOfSquares(factors));

        scanner.close();
    }
}
