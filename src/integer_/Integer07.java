package integer_;
import java.util.Scanner;
public class Integer07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ikki xonali son kiriting : ");
        int IkkiXonaliSon = scanner.nextInt();
        int birliklar = IkkiXonaliSon % 10 ;
        int onliklar = IkkiXonaliSon / 10;
        int sum = birliklar + onliklar;
        System.out.println("raqamlar yig'indisi : " + sum);
    }
}