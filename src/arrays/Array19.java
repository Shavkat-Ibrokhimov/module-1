package arrays;
import java.util.Scanner;
public class Array19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        int n;
        n = scanner.nextInt();
        int[] array19 = new int[n];
        for (int i = 0; i < array19.length; i++) {
            array19[i] = (int)(Math.random() * 100) + 1;
        }
        for (int element: array19) System.out.print(element + " ");
        System.out.println();
        int result = 0;
        for (int i = array19.length-1; i >= 0; i--) {
            if (array19[array19.length-1] > array19[i] && array19[0] < array19[i]) {
                result = i;
                break;
            }
        }
        if (result != 0){
            System.out.println("array19[" + result + "] = " + array19[result]);
        }
        else {
            System.out.println("Null");
        }
    }
}