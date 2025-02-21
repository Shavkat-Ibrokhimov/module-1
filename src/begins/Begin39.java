package begins;

import java.util.Scanner;

public class Begin39 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("A = ");
        int A = scanner.nextInt();

        System.out.print("B = ");
        int B = scanner.nextInt();

        System.out.println(" ");
        System.out.println(A + "x+" + B + "=0");
        System.out.println(" ");

        double x = (double) ((-1 * B) / A);
        System.out.print("x = " + x);

    }
}
