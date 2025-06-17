package MethodPractice.Level_1;

import java.util.Scanner;

public class ChocolateDivider {
    public static int[] find(int chocolates, int children) {
        int perChild = chocolates / children;
        int remainder = chocolates % children;
        return new int[]{perChild, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] result = find(chocolates, children);
        System.out.println("Each child gets: " + result[0] + ", Remaining: " + result[1]);
        sc.close();
    }
}
