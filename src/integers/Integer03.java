package integers;
import java.util.Scanner;
public class Integer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faylning hajmini kiriting (baytlarda) : ");
        int bayt = scanner.nextInt();
        int kbayt = (bayt / 1024) ;
        System.out.println("Result : " + kbayt);
    }
}
