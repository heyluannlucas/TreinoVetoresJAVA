package Activity1;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }

        System.out.println();
        System.out.println("Array:");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("odd numbers:");
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        int[] oddArray = new int[count];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 != 0) {
                oddArray[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(oddArray));
    }
}
