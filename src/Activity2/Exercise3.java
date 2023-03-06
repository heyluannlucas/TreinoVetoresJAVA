package Activity2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter the value for row " + (i + 1) + " and column " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] > 10) {
                    count++;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("A matriz possui " + count + " valores maiores que 10.");
    }
}
