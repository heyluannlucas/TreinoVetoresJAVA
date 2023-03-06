package Activity1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[16];
        int temp;

        for (int i = 0; i < 16; i++) {
            System.out.println("Type the " + (i + 1)+ "º value");
            array[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("array:" + Arrays.toString(array));

        for (int i = 0; i < 8; i++) {
            temp = array[i];
            array[i] = array[15 - i];
            array[15 - i] = temp;
        }

        System.out.println();
        System.out.println("new array:" + Arrays.toString(array));
    }
}
