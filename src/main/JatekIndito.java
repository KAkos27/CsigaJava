package main;

public class JatekIndito {

    public static void main(String[] args) {

        Jatek kitalalos = new KitalalosJatek();
        Jatek verseny = new CsigaVersenyJatek();

        Jatek[] jatekok = {kitalalos, verseny, new Jatek()};
        for (Jatek jatek : jatekok) {
           jatek.start();
        }
    }
}
