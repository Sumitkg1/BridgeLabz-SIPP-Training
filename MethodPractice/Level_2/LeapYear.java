package MethodPractice.Level_2;

import java.util.Scanner;

public class LeapYear {
     public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year < 1582) {
            System.out.println("Leap year rules apply only from year 1582 onwards.");
        } else {
            boolean isLeap = isLeapYear(year);
            if (isLeap) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        }

        scanner.close();
    }
}
