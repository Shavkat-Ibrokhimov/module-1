package integers;
import java.util.Scanner;
public class Integer01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("L (sm) = ");
        int L = scanner.nextInt();
        double result = (double) L / 100 ;
        System.out.println("Result : " + result);
    }
}