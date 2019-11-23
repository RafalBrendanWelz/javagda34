package dzien_5.obiektowe.enumy;

public enum Bilet {
    NORMALNY(3.2d),
    ULGOWY(1.6d),
    RODZINNY(2.0d);

    private double cena;


    Bilet(double cena) {
        this.cena = cena;
    }


    public double getCena() {
        return cena;
    }
}
