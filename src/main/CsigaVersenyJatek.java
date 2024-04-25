package main;

public class CsigaVersenyJatek extends Jatek {

    private static final int korokSzama = 5;

    @Override
    public void start() {
        System.out.println("Csigaverseny elindult");

        Csiga p = new Csiga();
        Csiga k = new Csiga();
        Csiga z = new Csiga();

        p.setSzin("P", "\033[0;31m");
        z.setSzin("Z", "\033[0;32m");
        k.setSzin("K", "\033[0;34m");

        String pSzin = p.getSzin();

        for (int i = 1; i < korokSzama + 1; i++) {
            p.setLepes();
            int pLepes = p.getLepes();
            p.setMegtett(pLepes);
            System.out.printf("(%d): %s lépett: %d-at/et | eddig megtett: %d\n", i, pSzin, pLepes, p.getMegtett());
        }
    }
}
