package Activity1;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[12];
        int x, y, sum = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println("Digite o " + (i + 1)+ "º valor");
            array[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println(Arrays.toString(array));

        System.out.println("Escolha a posição x do vetor");
        x = scanner.nextInt();
        System.out.println("Escolha a posição y do vetor");
        y = scanner.nextInt();

        sum = array[x] + array[y];

        System.out.println("Sum: " + sum);
    }
}
