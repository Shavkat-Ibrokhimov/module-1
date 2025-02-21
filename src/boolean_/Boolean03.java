package boolean_;
import java.util.Scanner;
public class Boolean03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int A = scanner.nextInt();
        if (A % 2 == 0 ){
            System.out.println("juft son");
        }else{
            System.out.println("juft son emas");
        }
    }
}