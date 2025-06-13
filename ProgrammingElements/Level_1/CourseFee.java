package ProgrammingElements.Level_1;

import java.util.Scanner;

public class CourseFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student fee amount: ");
        double fee = sc.nextDouble();

        
        double discountpercent = sc.nextDouble();

        double discount = (fee * discountpercent) / 100;
        double finalfee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalfee);

        sc.close();
    }
}
