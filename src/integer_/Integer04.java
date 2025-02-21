package integer_;
import java.util.Scanner;
public class Integer04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int a = scanner.nextInt();
        System.out.print("B = ");
        int b = scanner.nextInt();
        int result = a / b ;
        System.out.println("Result : " + result);
    }
}