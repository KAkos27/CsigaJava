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

        System.out.println(p.getSzin());
        System.out.println(z.getSzin());
        System.out.println(k.getSzin());
    }
}
