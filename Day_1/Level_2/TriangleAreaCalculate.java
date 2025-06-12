package Day_1.Level_2;

import java.util.Scanner;

public class TriangleAreaCalculate {

    public static void main(String[] args) {
        double base;
        double height;

        Scanner sc = new Scanner(System.in);
        base = sc.nextDouble();
        height = sc.nextDouble();

        double areaSqCm = 0.5 * base * height;
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);

        sc.close();
    }
}

