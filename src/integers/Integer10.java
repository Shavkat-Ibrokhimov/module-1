package integers;
import java.util.Scanner;
public class Integer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uch xonali son kiriting : ");
        int UchXonaliSon = scanner.nextInt();
        //int yuzliklar = UchXonaliSon / 100;
        int birliklar = UchXonaliSon % 10;
        int onliklar = ( UchXonaliSon / 10 ) % 10;
        System.out.println("birliklar xonasi : " + birliklar);
        System.out.println("o'nliklar xonasi : " + onliklar);
    }
}
