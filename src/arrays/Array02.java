package arrays;
import java.util.Scanner;
public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        int n = scanner.nextInt();
        int[] array02 = new int[n];
        for (int i = 1; i <= array02.length; i++) {
            array02[i-1] = (int)Math.pow(2,i);
        }
        for(int element : array02){
            System.out.print(element + " ");
        }
    }
}