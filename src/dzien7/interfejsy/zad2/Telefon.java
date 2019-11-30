package dzien7.interfejsy.zad2;

import java.util.Random;

public class Telefon implements Dzwoni {
    private String numerTelefou;
    private int lacznyCzasRozmow;

    public Telefon(String numerTelefou) {
        this.numerTelefou = numerTelefou;
        this.lacznyCzasRozmow = 0;
    }

    @Override
    public void zadzwon(String numerTelefonu) {
        Random random = new Random();
        if (random.nextInt(100) < 90) {
            System.out.println("Dzwonie na numer: " + numerTelefonu);
            int czasRozmowy = random.nextInt(60) + 1;
            this.lacznyCzasRozmow += czasRozmowy;
            System.out.println("Rozmawiales " + czasRozmowy + " minut.");
        } else {
            System.out.println("Brak sieci");
        }

    }

    @Override
    public void zadzwonNaNumerAlarmowy() {
        zadzwon(this.numerAlarmowy);
    }




}
