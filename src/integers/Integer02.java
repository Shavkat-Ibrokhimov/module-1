package integers;
import java.util.Scanner;
public class Integer02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("M (kg) = ");
        int M = scanner.nextInt();
        double result = (double) M / 1000 ;
        System.out.println("Result : " + result);
    }
}