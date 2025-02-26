package arrays;
import java.util.Scanner;
public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        int n;
        n = scanner.nextInt();
        System.out.print("arifmetik progressiyaning dastlabki hadi - A : ");
        int A;
        A = scanner.nextInt();
        System.out.print("arifmetik progressiyaning ayirmasi - D : ");
        int D;
        D = scanner.nextInt();
        int[] array03 = new int[n];
        for (int i = 0; i < array03.length; i++) {
            if(i == 0){
                array03[i] = A;
            }
            else {
                array03[i] = array03[i-1] + D;
            }
        }
        for(int element : array03) System.out.print(element + " ");
    }
}