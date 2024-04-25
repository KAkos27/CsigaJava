package main;

import java.util.Random;

public class Csiga {

    private String szin;
    private int lepes;
    private int megtett;

    public void setSzin(String nev, String szinkod) {
        szin = szinkod + nev + "\u001B[30m";
    }

    public String getSzin() {
        return szin;
    }

    public void setLepes(boolean gyorsitott) {
        Random rnd = new Random();
        lepes = rnd.nextInt(4);
        if (gyorsitott) {
            lepes *= 2;
        }
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
