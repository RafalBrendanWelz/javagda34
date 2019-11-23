package dzien_5.obiektowe.enumy;

public class Main {
    public static void main(String[] args) {

        Bilet normalny = Bilet.NORMALNY_CALODNIOWY;
        Bilet ulgowy = Bilet.ULGOWY_GODZINNY;
        Bilet brak = Bilet.BRAK_BILETU;


        ulgowy.wyswietlDaneOBilecie();
        normalny.wyswietlDaneOBilecie();
        brak.wyswietlDaneOBilecie();


        Bilet zwrocony = Bilet.dobierzBilet(14, 100, 6.0d);
        zwrocony.wyswietlDaneOBilecie();

    }
}
