package ifs;
import java.util.Scanner;
import static java.lang.System.*;
public class If20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("A = ");
        double A = scanner.nextDouble();
        out.print("B = ");
        double B = scanner.nextDouble();
        out.print("C = ");
        double C = scanner.nextDouble();
        if(Math.abs(A-B) < Math.abs(A-C)){
            out.println("B nuqta yaqin.");
        }
        else if(Math.abs(A-B) > Math.abs(A-C)){
            out.println("C nuqta yaqin.");
        }
        else{
            out.println("masofalar o'zaro teng!");
        }
    }
}