package booleans;
import java.util.Scanner;
public class Boolean01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int A = scanner.nextInt();
        if (A > 0){
            System.out.println("A soni musbat");
        }else{
            System.out.println("A soni musbat emas");
        }
    }
}