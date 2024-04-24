package main;

import java.util.Random;

public class Jatekos {

    int tipp;

    void tippel() {
        Random rnd = new Random();
        tipp = rnd.nextInt(10);
        System.out.println("tippelésem: " + tipp);
    }
}
