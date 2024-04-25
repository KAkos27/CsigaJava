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

        Nezo n = new Nezo();
        n.setFogadas();
        String fogadas = n.getFogadas();

        String pSzin = p.getSzin();
        String zSzin = z.getSzin();
        String kSzin = k.getSzin();

        for (int i = 1; i < korokSzama + 1; i++) {
            p.setLepes();
            int pLepes = p.getLepes();
            p.setMegtett(pLepes);
            System.out.printf("(%d): %s lépett: %d-at/et | eddig megtett: %d\n", i, pSzin, pLepes, p.getMegtett());

            z.setLepes();
            int zLepes = z.getLepes();
            z.setMegtett(zLepes);
            System.out.printf("(%d): %s lépett: %d-at/et | eddig megtett: %d\n", i, zSzin, zLepes, z.getMegtett());

            k.setLepes();
            int kLepes = k.getLepes();
            k.setMegtett(kLepes);
            System.out.printf("(%d): %s lépett: %d-at/et | eddig megtett: %d\n", i, kSzin, kLepes, k.getMegtett());
            System.out.println("-----------------------------------------------------------------");
        }

    }
}
