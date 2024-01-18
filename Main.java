import java.util.Scanner;

import Exceptions.EingabeFehler;

public class Main {

    public static void main(String[] args) {
        GerUnge numGerade = new GerUnge();
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Ungerade/Gerade Zahl ---");
        System.out.print("Geben die die Zahl ein: ");
        int eingabe = scan.nextInt();

        scan.close();

        try {
            numGerade.gerade(eingabe);
        } catch (EingabeFehler e) {
            System.out.println(e.getMessage());
        }
    }
}