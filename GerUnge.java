import Exceptions.EingabeFehler;

public class GerUnge {

    public GerUnge() {

    }

    public void gerade(int num) throws EingabeFehler {
        int gerade = num % 2;

        if (gerade == 0) {
            System.out.println("Die eingegebene Zahl ist eine Gerade Zahl!");
        } else if (gerade != 0) {
            System.out.println("Die eingegebene Zahl ist ungerade!");
        } else {
            //Diese Exception ist fast nie zu erreichen da wenn man etwas falsches eingibt der Scanner auch anspringt.
            throw new EingabeFehler("Falsche Eingabe! ");
        }
    }
}
