package main;

import java.util.Random;

public class CsigaVersenyJatek extends Jatek {

    private static final int KOROK_SZAMA = 5;
    private static final Random rnd = new Random();

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
        String zSzin = z.getSzin();
        String kSzin = k.getSzin();

        for (int i = 1; i < KOROK_SZAMA + 1; i++) {
            int gyorsito = rnd.nextInt(1, 6);
            int melyikCsiga = 4;
            if (gyorsito == 1) {
                melyikCsiga = rnd.nextInt(1, 4);
                System.out.printf("*A %d. csiga begyorsult!*\n", melyikCsiga);
            }

            boolean pGyorsitott = melyikCsiga == 1;
            boolean zGyorsitott = melyikCsiga == 2;
            boolean kGyorsitott = melyikCsiga == 3;

            p.setLepes(pGyorsitott);
            int pLepes = p.getLepes();
            p.setMegtett(pLepes);
            System.out.printf("(%d): %s lépett: %d | eddig megtett: %d\n", i, pSzin, pLepes, p.getMegtett());

            z.setLepes(zGyorsitott);
            int zLepes = z.getLepes();
            z.setMegtett(zLepes);
            System.out.printf("(%d): %s lépett: %d | eddig megtett: %d\n", i, zSzin, zLepes, z.getMegtett());

            k.setLepes(kGyorsitott);
            int kLepes = k.getLepes();
            k.setMegtett(kLepes);
            System.out.printf("(%d): %s lépett: %d | eddig megtett: %d\n", i, kSzin, kLepes, k.getMegtett());
            System.out.println("---------------------------------------");
        }

    }
}
