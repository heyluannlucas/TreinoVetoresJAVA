package Activity2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int count = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter the element for row " + (i + 1) + " and column " + (j + 1));
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("The matrix contains " + count + " even numbers.");
    }
}

