package arrays;
import java.util.Scanner;
public class Array18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        int n;
        n = scanner.nextInt();
        int[] array18 = new int[n];
        for (int i = 0; i < array18.length; i++) {
            array18[i] = (int)(Math.random() * 100) + 1;
        }
        for (int element: array18) System.out.print(element + " ");
        System.out.println();
        for (int i = 0; i < array18.length; i++) {
            if (array18[array18.length-1] > array18[i]) {
                System.out.println("array18[" + i + "] = " + array18[i]);
                break;
            }
        }
    }
}