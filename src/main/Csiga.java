package main;

import java.util.Random;

public class Csiga {

    private String szin;
    private int lepes;
    private int megtett;

    public void setSzin(String nev, String szinkod) {
        szin = szinkod + nev;
    }

    public String getSzin() {
        return szin;
    }

    public void setLepes() {
        Random rnd = new Random();
        lepes = rnd.nextInt(3);
    }

    public int getLepes() {
        return lepes;
    }

    public void setMegtett(int lepes) {
        megtett += lepes;
    }

    public int getMegtett() {
        return megtett;
    }
}
