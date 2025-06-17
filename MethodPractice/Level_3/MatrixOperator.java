package MethodPractice.Level_3;

import java.util.*;

public class MatrixOperator {

    // Generates a random matrix of given dimensions
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = rand.nextInt(10); // Random values 0-9
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int r = m1.length;
        int c = m1[0].length;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] m1, int[][] m2) {
        int r = m1.length;
        int c = m1[0].length;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int r1 = m1.length;
        int c1 = m1[0].length;
        int c2 = m2[0].
