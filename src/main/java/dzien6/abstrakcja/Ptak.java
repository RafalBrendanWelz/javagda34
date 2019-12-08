package dzien6.abstrakcja;

public abstract class Ptak extends Zwierze{

    public Ptak(boolean ogon, String umaszczenie, int iloscKonczyn) {
        super(ogon, umaszczenie, iloscKonczyn);
    }

    @Override
    public void dajGlos() {
        System.out.println("Cwir Cwir");
    }
}
