package arrays;
import java.util.Scanner;
public class Array20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.print("N = ");
        N = scanner.nextInt();
        int[] Array20 = new int[N];
        for (int i = 0; i < Array20.length; i++) {
            Array20[i] = (int)(Math.random() * 100) + 1;
            System.out.print(Array20[i] + " ");
        }
        System.out.println();
        int K, L;
        System.out.println("0 <= K <= L < N");
        System.out.print("K = ");
        K = scanner.nextInt();
        System.out.print("L = ");
        L = scanner.nextInt();
        for (int i = K; i < L + 1 ; i++) {
            System.out.print(Array20[i] + " ");
        }
    }
}