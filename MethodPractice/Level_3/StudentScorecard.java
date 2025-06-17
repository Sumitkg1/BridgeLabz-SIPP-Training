package MethodPractice.Level_3;

import java.util.*;

public class StudentScorecard {
      public static int[][] generatePCMMarks(int studentCount) {
        Random rng = new Random();
        int[][] marks = new int[studentCount][3];
        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = rng.nextInt(41) + 60; // Scores between 60-100
            }
        }
        return marks;
    }

    public static double[][] computeScores(int[][] pcmData) {
        int totalSubjects = 3;
        double[][] scores = new double[pcmData.length][3]; // [Total, Average, Percentage]

        for (int i = 0; i < pcmData.length; i++) {
            int totalMarks = 0;
            for (int j = 0; j < totalSubjects; j++) {
                totalMarks += pcmData[i][j];
            }
            double avg = (double) totalMarks / totalSubjects;
            double percentage = (totalMarks / (totalSubjects * 100.0)) * 100;

            scores[i][0] = Math.round(totalMarks * 100.0) / 100.0;
            scores[i][1] = Math.round(avg * 100.0) / 100.0;
            scores[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return scores;
    }

    public static void showReportCard(int[][] pcmScores, double[][] computedData) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-15s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");
        for (int i = 0; i < pcmScores.length; i++) {
            System.out.printf(
                "%-10d%-10d%-10d%-10d%-10.0f%-10.2f%-15.2f\n",
                (i + 1),
                pcmScores[i][0],
                pcmScores[i][1],
                pcmScores[i][2],
                computedData[i][0],
                computedData[i][1],
                computedData[i][2]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentCount = sc.nextInt();

        int[][] pcmScores = generatePCMMarks(studentCount);
        double[][] scoreResults = computeScores(pcmScores);

        System.out.println("\nSTUDENT REPORT CARD");
        showReportCard(pcmScores, scoreResults);
    }
}
