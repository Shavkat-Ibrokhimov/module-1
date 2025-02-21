package ifs;
import java.util.Scanner;
public class If22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("koordinata X = ");
        int X = scanner.nextInt();
        System.out.print("koordinata Y = ");
        int Y = scanner.nextInt();
        boolean I_chorak = (X > 0) && (Y > 0);
        boolean II_chorak = (X < 0) && (Y > 0);
        boolean III_chorak = (X < 0) && (Y < 0);
        boolean IV_chorak = (X > 0) && (Y < 0);
        boolean X_koor = (Y == 0);
        boolean Y_koor = (X == 0);
        if (I_chorak) System.out.println("I chorakda joylashgan");
        else if (II_chorak) System.out.println("II chorakda joylashgan");
        else if (III_chorak) System.out.println("III chorakda joylashgan");
        else if (IV_chorak) System.out.println("IV chorakda joylashgan");
        else if (X_koor) System.out.print("X o'qida joylashgan");
        else System.out.print("Y o'qida joylashgan");
    }
}