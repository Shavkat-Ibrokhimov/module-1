package boolean_;
import java.util.Scanner;
public class Boolean05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int A = scanner.nextInt();
        System.out.print("B = ");
        int B = scanner.nextInt();
        if (A >= 0 && B < -2){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}