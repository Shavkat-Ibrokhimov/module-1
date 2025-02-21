package begin_;

import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("a = ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(a * a + b * b);
        double P = a + b + c;

        System.out.println("c = " + c);
        System.out.println("P = " + P);

    }
}
