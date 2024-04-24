package main;

import java.util.Random;

public class KitalalosJatek extends Jatek {

    public KitalalosJatek() {
        //start();
    }

    @Override
    public void start() {
        System.out.println("Gondoltam egy számra, 0 és 9 között...");

        Random rnd = new Random();
        int szam = rnd.nextInt(10);

        Jatekos jatekos1 = new Jatekos();
        Jatekos jatekos2 = new Jatekos();
        Jatekos jatekos3 = new Jatekos();

        boolean joTipp1, joTipp2, joTipp3;
        boolean vanNyertes;

        do {

            System.out.println("a kitalálandó szám: " + szam);

            jatekos1.tippel();
            jatekos2.tippel();
            jatekos3.tippel();

            System.out.println("1. játékos tippje: " + jatekos1.tipp);
            System.out.println("2. játékos tippje: " + jatekos2.tipp);
            System.out.println("3. játékos tippje: " + jatekos3.tipp);

            joTipp1 = szam == jatekos1.tipp;
            joTipp2 = szam == jatekos2.tipp;
            joTipp3 = szam == jatekos3.tipp;
            vanNyertes = joTipp1 || joTipp2 || joTipp3;

            if (!vanNyertes) {
                System.out.println("a játékosok újra próbálkoznak!");
            }

        } while (!vanNyertes);
        System.out.println("van nyertes!");
        System.out.println("1. játékos tippje jó? " + joTipp1);
        System.out.println("2. játékos tippje jó? " + joTipp2);
        System.out.println("3. játékos tippje jó? " + joTipp3);
        System.out.println("program vége");
    }
}
