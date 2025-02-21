package integers;
import java.util.Scanner;
public class Integer05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int a = scanner.nextInt();
        System.out.print("B = ");
        int b = scanner.nextInt();
        int result = a / b ;
        int result2 = a % b;
        System.out.println(result + " marta joylashtirish mumkin;");
        System.out.println(b - result2 + " joylashmagan qismi;");
    }
}