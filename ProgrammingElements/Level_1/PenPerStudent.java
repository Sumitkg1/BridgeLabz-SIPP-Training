package ProgrammingElements.Level_1;

import java.util.Scanner;

public class PenPerStudent {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of pens: ");
        int total= sc.nextInt();

        System.out.print("Enter number of students: ");
        int totalstudents = sc.nextInt();

        int penperstudent= total/ totalstudents;
        int remainingpens = total% totalstudents;

        System.out.println("The Pen Per Student is " + penperstudent+ " and the remaining pen not distributed is " + remainingpens);
    }
}
