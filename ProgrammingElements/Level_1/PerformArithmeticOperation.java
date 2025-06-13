package ProgrammingElements.Level_1;

import java.util.Scanner;

public class PerformArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1= sc.nextDouble();
        double number2= sc.nextDouble();
        double difference;
        double division;
        if(number1 <number2){
             difference = number2 - number1;

        }
        double sum = number1 + number2;
          difference = number2 - number1;
        
        double product = number1 * number2; 
        division=number1 / number2;
        if(number2 != 0) {
            division = number1 / number2;
        } 
         System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + sum + ", " + difference + ", " + product+ ", and " + division);

        sc.close();
    }
}
