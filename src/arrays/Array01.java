package arrays;
import java.util.Scanner;
public class Array01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i<array.length; i++) {
            array[i] = 2 * i + 1;
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}