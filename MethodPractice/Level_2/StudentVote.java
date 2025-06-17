package MethodPractice.Level_2;

import java.util.Scanner;

public class StudentVote {
       public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        } else {
            return age >= 18;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();

            if (canStudentVote(ages[i])) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible to vote");
            }
        }

        scanner.close();
    }
}
