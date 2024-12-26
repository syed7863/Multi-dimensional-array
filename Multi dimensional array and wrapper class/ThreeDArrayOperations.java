package syed;
import java.util.Random;

public class ThreeDArrayOperations {

    public static void main(String[] args) {
        int x = 2, y = 4, z = 3; // Dimensions of the 3D array
        int[][][] array = new int[x][y][z];

        initializeArray(array);
        System.out.println("3D Array:");
        displayArray(array);

        int max = findMax(array);
        System.out.println("\nMaximum value: " + max);

        double average = calculateAverage(array);
        System.out.println("Average value: " + average);
    }

    // 1. Initializing the 3D array with random values
    public static void initializeArray(int[][][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt(100); // Random values between 0 and 99
                }
            }
        }
    }

    // 2. Finding the maximum value in the array
    public static int findMax(int[][][] array) {
        int max = Integer.MIN_VALUE;
        for (int[][] twoDArray : array) {
            for (int[] oneDArray : twoDArray) {
                for (int value : oneDArray) {
                    if (value > max) {
                        max = value;
                    }
                }
            }
        }
        return max;
    }

    // 3. Calculating the average of all elements
    public static double calculateAverage(int[][][] array) {
        int sum = 0;
        int count = 0;
        for (int[][] twoDArray : array) {
            for (int[] oneDArray : twoDArray) {
                for (int value : oneDArray) {
                    sum += value;
                    count++;
                }
            }
        }
        return (double) sum / count;
    }

    // 4. Displaying the array
    public static void displayArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
