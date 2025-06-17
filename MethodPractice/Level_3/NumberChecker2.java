package MethodPractice.Level_3;

import java.util.*;

public class NumberChecker2 {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigitsArray(int number) {
        String str = String.valueOf(number);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }
        return false;
    }

    public static boolean isArmstrong(int[] digits, int number) {
        int power = digits.length;

        int sum = 0;

        for (int digit : digits) {

            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    public static int[] findTwoLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {

                second = largest;
                
                largest = digit;
            } else if (digit > second && digit != largest) {
                second = digit;
            }

        }

        
        return new int[] { largest, second };
    }

    public static int[] findTwoSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                second = smallest;
                smallest = digit;
            } else if (digit < second && digit != smallest) {
                second = digit;
            }
        }
        return new int[] { smallest, second };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println(digitCount);
        System.out.println(Arrays.toString(digits));
        System.out.println(isDuckNumber(digits));
        System.out.println(isArmstrong(digits, number));

        int[] largestTwo = findTwoLargest(digits);
        System.out.println(largestTwo[0]);
        System.out.println(largestTwo[1]);

        int[] smallestTwo = findTwoSmallest(digits);
        System.out.println(smallestTwo[0]);
        System.out.println(smallestTwo[1]);
    }
}
