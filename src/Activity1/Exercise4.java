package Activity1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        int x, i = 0;
        boolean found = false;

        while (i < 20) {
            System.out.println("Type" + (i + 1)+ "º value");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println();
        System.out.println("array:" + Arrays.toString(array));

        x = scanner.nextInt();
        i = 0;

        while (i < 20 && !found) {
            if (array[i] == x) {
                System.out.println("X found at position " + (i + 1));
                found = true;
            }
            i++;
        }

        if (!found) {
            System.out.println("X not found");
        }
    }
}
