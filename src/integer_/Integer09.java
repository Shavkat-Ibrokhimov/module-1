package integer_;
import java.util.Scanner;
public class Integer09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uch xonali son kiriting : ");
        int UchXonaliSon = scanner.nextInt();
        int yuzliklar = UchXonaliSon / 100;
        System.out.println("yuzliklar xonasi : " + yuzliklar);
    }
}