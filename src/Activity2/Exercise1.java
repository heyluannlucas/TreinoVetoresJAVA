package Activity2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int max = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter the value for row " + (i + 1) + " and column " + (j + 1) + ": ");
                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The largest value is " + max + " and is located at row " + (maxRow + 1) + " and column " + (maxCol + 1));
    }
}
