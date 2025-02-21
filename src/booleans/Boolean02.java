package booleans;
import java.util.Scanner;
public class Boolean02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int A = scanner.nextInt();
        if (A % 2 != 0 ){
            System.out.println("toq son");
        }else{
            System.out.println("toq son emas");
        }
    }
}