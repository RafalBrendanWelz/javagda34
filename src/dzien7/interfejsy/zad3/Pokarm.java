package dzien7.interfejsy.zad3;

import java.util.Scanner;

public class Pokarm {
    private String nazwa;
    private TypPokarmu typPokarmu;
    private double waga;

    public Pokarm(String nazwa, TypPokarmu typPokarmu, double waga) {
        this.nazwa = nazwa;
        this.typPokarmu = typPokarmu;
        this.waga = waga;
    }

    public String getNazwa() {
        return nazwa;
    }

    public TypPokarmu getTypPokarmu() {
        return typPokarmu;
    }

    public double getWaga() {
        return waga;
    }
}
