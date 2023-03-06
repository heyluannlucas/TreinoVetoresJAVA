package Activity2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int[][] matrix = {{6, 1, 0}, {7, 5, 2}, {7, 4, 5}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == number) {
                    System.out.println("Number found at row: " + (i + 1) + " and column: " + (j + 1));
                    return;
                }
            }
        }

        System.out.println("Number not found in the matrix.");
    }
}
