package main;

import java.util.Scanner;

public class Nezo {

    private static String fogadas;

    public void setFogadas() {
        Scanner src = new Scanner(System.in);
        System.out.println("Melyik csigára fogadsz: (p,z,k) ");
        fogadas = src.nextLine();
    }

    public String getFogadas() {
        return fogadas;
    }
}
