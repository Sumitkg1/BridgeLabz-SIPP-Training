package ProgrammingElements.Level_1;

import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Maximum number of possible handshakes is: " + handshakes);
    }
    
}
