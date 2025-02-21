package integer_;
import java.util.Scanner;
public class Integer06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ikki xonali son kiriting : ");
        int IkkiXonaliSon = scanner.nextInt();
        int birliklar = IkkiXonaliSon % 10 ;
        int onliklar = IkkiXonaliSon / 10;
        System.out.println("o'nliklar xonasi : " + onliklar);
        System.out.println("birliklar xonasi : " + birliklar);
    }
}