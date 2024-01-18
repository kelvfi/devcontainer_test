import java.util.Scanner;

import Exceptions.EingabeFehler;

public class Main {

    public static void main(String[] args) {
        Handler handler = new Handler();
        Scanner scan = new Scanner(System.in);

        System.out.println("--- ZAHLENTESTER FÜR DUMME WIE MICH ---");
        System.out.println("1. --- Gerade / Ungerade ---");
        System.out.println("2. --- Primzahl Tester ---");
        System.out.println("---------------------------------------");
        System.out.println("3. --- Beenden des tests ---");

        int eingabe = scan.nextInt();

        switch (eingabe) {
            case 1:
                handler.geraderUngeradeMenue();
                break;
            case 2:
                handler.primzahl();
                break;
            default:
                break;
        }
        
        scan.close();
    }
}