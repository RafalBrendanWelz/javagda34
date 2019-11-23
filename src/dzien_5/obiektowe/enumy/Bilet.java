package dzien_5.obiektowe.enumy;

public enum Bilet {

    ULGOWY_GODZINNY(1.6d, 60),
    ULGOWY_CALODNIOWY(5.0d, 1440),
    NORMALNY_GODZINNY(3.2, 60),
    NORMALNY_CALODNIOWY(10.0d, 1440),
    BRAK_BILETU(0.0d, 0);

    private double cena;
    private int czasJazdy;


    Bilet(double cena, int czasJazdy) {
        this.cena = cena;
        this.czasJazdy = czasJazdy;
    }

    public static Bilet dobierzBilet(int wiek, int czasJazdy, double hajs) {
        if (wiek > 25) {
            if (czasJazdy > 60) {
                if (hajs > NORMALNY_CALODNIOWY.getCena()) {
                    return NORMALNY_CALODNIOWY;
                } else {
                    return BRAK_BILETU;
                }
            } else {
                if (hajs > NORMALNY_GODZINNY.getCena()) {
                    return NORMALNY_GODZINNY;
                } else {
                    return BRAK_BILETU;
                }
            }
        } else {
            if (czasJazdy > 60) {
                if (hajs > ULGOWY_CALODNIOWY.getCena()) {
                    return ULGOWY_CALODNIOWY;
                } else {
                    return BRAK_BILETU;
                }
            } else {
                if (hajs > ULGOWY_GODZINNY.getCena()) {
                    return ULGOWY_GODZINNY;
                } else {
                    return BRAK_BILETU;
                }
            }
        }
    }

    public int getCzasJazdy() {
        return czasJazdy;
    }

    public double getCena() {
        return cena;
    }

    public void wyswietlDaneOBilecie() {
        System.out.println("Bilet " + this.name().toLowerCase() + " " + ((double) this.getCzasJazdy()) / 60 + " godzinny");
    }
}
