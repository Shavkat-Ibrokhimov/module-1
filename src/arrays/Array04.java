package arrays;
import java.util.Scanner;
public class Array04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        int n;
        n = scanner.nextInt();
        System.out.print("geometrik progressiyaning dastlabki hadi - A : ");
        int A;
        A = scanner.nextInt();
        System.out.print("geometrik progressiyaning maxraji - D : ");
        int D;
        D = scanner.nextInt();
        int[] array04 = new int[n];
        for (int i = 0; i < array04.length; i++) {
            if(i == 0){
                array04[i] = A;
            }
            else {
                array04[i] = array04[i-1] * D;
            }
        }
        for(int element : array04) System.out.print(element + " ");
    }
}