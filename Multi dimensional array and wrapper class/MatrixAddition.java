package syed;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        Integer[][] matrix1 = new Integer[rows][cols];
        Integer[][] matrix2 = new Integer[rows][cols];

        System.out.println("Enter elements of the first matrix:");
        inputMatrix(matrix1, scanner);

        System.out.println("Enter elements of the second matrix:");
        inputMatrix(matrix2, scanner);

        Integer[][] resultMatrix = addMatrices(matrix1, matrix2);

        System.out.println("Resulting matrix after addition:");
        displayMatrix(resultMatrix);
    }

    // Method to take matrix input
    public static void inputMatrix(Integer[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to add two matrices
    public static Integer[][] addMatrices(Integer[][] matrix1, Integer[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        Integer[][] result = new Integer[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(Integer[][] matrix) {
        for (Integer[] row : matrix) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
