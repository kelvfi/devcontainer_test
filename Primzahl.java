public class Primzahl {
    
    public Primzahl() {

    }

    public void prim(int num) {
        // Wenn kleiner als 2 kann es keine Primzahl sein.
        if (num < 2) {
            System.out.println("Keine Primzahl!");
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Keine Primzahl!");
            }
        }

        System.out.println("Primzahl");
    }
}
