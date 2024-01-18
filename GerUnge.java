import Exceptions.EingabeFehler;

/**
 * In dieser Klasse geht es um gerade und ungerade Zahlen.
 */
public class GerUnge {

    public GerUnge() {

    }

    /**
     * Hier berechnet man ob es eine gerade oder eine
     * ungerade zahl handelt.
     * 
     * @param num = Eingegebene Nummer.
     * @throws EingabeFehler = Falls etwas Falsches eingegeben wurde
     */
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
