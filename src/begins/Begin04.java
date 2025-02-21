package begins;

import java.util.Scanner;

public class Begin04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("d = ");
        double d = scanner.nextDouble();
        double Pi = 3.14;
        double L = Pi * d;
        System.out.print("L = " + L);
    }
}
