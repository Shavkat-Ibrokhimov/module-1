package ifs;
import java.util.Scanner;
public class If27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X = ");
        double X = scanner.nextDouble();
        if (X < 0) {
            System.out.println(0);
        } else if ((int)(X) % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}