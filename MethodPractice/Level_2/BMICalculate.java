package MethodPractice.Level_2;

import java.util.Scanner;

public class BMICalculate {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }

    public static String[] getBMIStatuses(double[][] data) {
        String[] string= new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
               string[i] = "Underweight";
            } else if (bmi <= 24.9) {
               string[i] = "Normal";
            } else if (bmi <= 39.9) {
               string[i] = "Overweight";
            } else {
               string[i] = "Obese";
            }
        }
        return string;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            personData[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            personData[i][1] = sc.nextDouble();
        }

        calculateBMI(personData);
        String[] string= getBMIStatuses(personData);

        System.out.println("Person  Weight(kg)  Height(cm)  BMI        Status");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "        " +
                    personData[i][0] + "         " +
                    personData[i][1] + "       " +
                    personData[i][2] + "   " +
                   string[i]);
        }

        sc.close();
    }
}
