package booleans;
import java.util.Scanner;
public class Boolean04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int A = scanner.nextInt();
        System.out.print("B = ");
        int B = scanner.nextInt();
        if (A > 2 && B <= 3){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}