import java.util.Scanner;

import Exceptions.EingabeFehler;

public class Handler {
    
    private GerUnge numGerade;
    private Primzahl primzahl;
    private Scanner scan = new Scanner(System.in);

    public Handler() {
        numGerade = new GerUnge();
        primzahl = new Primzahl();
    }

    public void geraderUngeradeMenue() {

        System.out.printf("%n--- Ungerade/Gerade Zahl %n---");
        System.out.print("Geben die Zahl ein: ");
        int gerNum = scan.nextInt();

        try {
            numGerade.gerade(gerNum);
        } catch (EingabeFehler e) {
            System.out.println(e.getMessage());
        }
    }

    public void primzahl() {
        System.out.printf("%n--- Primzahl %n---");
        System.out.print("Geben die Zahl ein: ");
        int prim = scan.nextInt();

        primzahl.prim(prim);
    }
}
