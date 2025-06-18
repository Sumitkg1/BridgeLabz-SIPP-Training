package Strings.Level_2;
import java.util.*;

public class StudentScore {

    public static void main(String[] args) {
        int students = 5;

        int[][] scores = generateRandomScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = assignGrades(results);
        
        displayScorecard(scores, results, grades);
    }

    public static int[][] generateRandomScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60;
            scores[i][1] = rand.nextInt(41) + 60;
            scores[i][2] = rand.nextInt(41) + 60;
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return result;
    }

    public static String[] assignGrades(double[][] result) {
        String[] grades = new String[result.length];
        for (int i = 0; i < result.length; i++) {
            double perc = result[i][2];
            if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B";
            else if (perc >= 60) grades[i] = "C";
            else if (perc >= 50) grades[i] = "D";
            else if (perc >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("S.No\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t" +
                (int)results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2] + "\t\t" +
                grades[i] + "\n");
        }
    }
}
