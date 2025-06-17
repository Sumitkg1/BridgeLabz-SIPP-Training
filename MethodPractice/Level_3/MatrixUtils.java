package MethodPractice.Level_3;
import java.util.*;

public class MatrixUtils {

    public static int[][] generateMatrix(int rowCount, int colCount) {
        Random rng = new Random();
        int[][] result = new int[rowCount][colCount];
        for (int i = 0; i < rowCount; i++)
            for (int j = 0; j < colCount; j++)
                result[i][j] = rng.nextInt(10);
        return result;
    }

    public static int[][] getTranspose(int[][] input) {
        int row = input.length;
        int col = input[0].length;
        int[][] transposed = new int[col][row];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                transposed[j][i] = input[i][j];
        return transposed;
    }

    public static int calcDeterminant2x2(int[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    public static int calcDeterminant3x3(int[][] mat) {
        int x = mat[0][0] * (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1]);
        int y = mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0]);
        int z = mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);
        return x - y + z;
    }

    public static double[][] getInverse2x2(int[][] mat) {
        int det = calcDeterminant2x2(mat);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1];
        inv[0][1] = -mat[0][1];
        inv[1][0] = -mat[1][0];
        inv[1][1] = mat[0][0];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                inv[i][j] /= det;
        return inv;
    }

    public static double[][] getInverse3x3(int[][] mat) {
        int det = calcDeterminant3x3(mat);
        if (det == 0) return null;
        double[][] inverse = new double[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                int[][] sub = new int[2][2];
                for (int i = 0, subi = 0; i < 3; i++) {
                    if (i == r) continue;
                    for (int j = 0, subj = 0; j < 3; j++) {
                        if (j == c) continue;
                        sub[subi][subj++] = mat[i][j];
                    }
                    subi++;
                }
                int sign = ((r + c) % 2 == 0) ? 1 : -1;
                inverse[c][r] = sign * calcDeterminant2x2(sub) / (double) det;
            }
        }
        return inverse;
    }

    public static void printMatrix(int[][] data) {
        for (int[] row : data) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void printMatrix(double[][] data) {
        for (double[] row : data) {
            for (double val : row)
                System.out.printf("%.2f ", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] square2 = generateMatrix(2, 2);
        int[][] square3 = generateMatrix(3, 3);

        System.out.println("Random 2x2 Matrix:");
        printMatrix(square2);

        System.out.println("Transpose:");
        printMatrix(getTranspose(square2));

        System.out.println("Determinant: " + calcDeterminant2x2(square2));

        double[][] inv2 = getInverse2x2(square2);
        if (inv2 != null) {
            System.out.println("Inverse:");
            printMatrix(inv2);
        } else {
            System.out.println("Inverse does not exist (Det = 0)");
        }

        System.out.println("\nRandom 3x3 Matrix:");
        printMatrix(square3);

        System.out.println("Transpose:");
        printMatrix(getTranspose(square3));

        System.out.println("Determinant: " + calcDeterminant3x3(square3));

        double[][] inv3 = getInverse3x3(square3);
        if (inv3 != null) {
            System.out.println("Inverse:");
            printMatrix(inv3);
        } else {
            System.out.println("Inverse does not exist (Det = 0)");
        }
    }
}
