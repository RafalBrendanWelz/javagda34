package dzien_5.obiektowe.ulamki;

public class Ulamek {
    private int licznik, mianownik;

    public Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public void wypisz() {
        System.out.println(licznik + "/" + mianownik);
    }

    public void dodaj(Ulamek tenDoDodania) {
        Ulamek[] tablicaSprowadzonych = sprowadzDoWspolnegoMianownika(this, tenDoDodania);

        this.licznik = tablicaSprowadzonych[0].licznik + tablicaSprowadzonych[1].licznik;
        this.mianownik = tablicaSprowadzonych[0].mianownik;
    }

    private Ulamek[] sprowadzDoWspolnegoMianownika(Ulamek pierwszy, Ulamek drugi) {
        Ulamek[] wyniki = new Ulamek[2];
        int nowyLicznikPierwszego = pierwszy.licznik * drugi.mianownik;
        int nowyLicznikDrugiego = drugi.licznik * pierwszy.mianownik;
        int nowyMianownik = pierwszy.mianownik * drugi.mianownik;

        Ulamek pierwszySprowadzony = new Ulamek(nowyLicznikPierwszego, nowyMianownik);
        Ulamek drugiSprowadzony = new Ulamek(nowyLicznikDrugiego, nowyMianownik);

        wyniki[0] = pierwszySprowadzony;
        wyniki[1] = drugiSprowadzony;

        return wyniki;
    }

}
