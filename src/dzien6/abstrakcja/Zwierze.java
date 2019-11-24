package dzien6.abstrakcja;

public abstract class Zwierze {
    protected boolean ogon;
    String umaszczenie;
    int iloscKonczyn;

    public Zwierze(boolean ogon, String umaszczenie, int iloscKonczyn) {
        this.ogon = ogon;
        this.umaszczenie = umaszczenie;
        this.iloscKonczyn = iloscKonczyn;
    }

    public abstract void dajGlos();
}
