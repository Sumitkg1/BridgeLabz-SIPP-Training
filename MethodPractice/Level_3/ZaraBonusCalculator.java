package MethodPractice.Level_3;
import java.util.Random;

public class ZaraBonusCalculator {

    public static double[][] generateEmployeeData(int count) {

        
        double[][] data = new double[count][2]; // [salary, years of service]
        
        
        Random rand = new Random();


        for (int i = 0; i < count; i++) {
            double salary = 10000 + rand.nextInt(90000);
            int years = rand.nextInt(11);
            data[i][0] = salary;
            data[i][1] = years;
        }

        
        return data;
    }




    public static double[][] calculateBonusAndNewSalary(double[][] empData) {
        double[][] result = new double[empData.length][3]; // [bonus, new salary, years]




        
        for (int i = 0; i < empData.length; i++) {
            double oldSalary = empData[i][0];
        
        
            double years = empData[i][1];
            double bonus = (years > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;



            
            result[i][0] = Math.round(bonus * 100.0) / 100.0;
            
            result[i][1] = Math.round(newSalary * 100.0) / 100.0;
            result[i][2] = years;
        }

        return result;
    }

    public static void displayResults(double[][] empData, double[][] bonusData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("EmpID\tSalary\t\tYears\tBonus\t\tNew Salary");
        for (int i = 0; i < empData.length; i++) {
            double oldSalary = Math.round(empData[i][0] * 100.0) / 100.0;
            double years = empData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOld += oldSalary;
            totalBonus += bonus;
            totalNew += newSalary;

            System.out.println(
                (i + 1) + "\t" +
                oldSalary + "\t" +
                (int) years + "\t" +
                bonus + "\t" +
                newSalary
            );
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("TOTAL\t" + Math.round(totalOld * 100.0) / 100.0 +
                           "\t\t\t" + Math.round(totalBonus * 100.0) / 100.0 +
                           "\t" + Math.round(totalNew * 100.0) / 100.0);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;

        double[][] employeeData = generateEmployeeData(numberOfEmployees);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);

        displayResults(employeeData, bonusData);
    }
}

