package dzien_5.obiektowe.ulamki;

public class Main {
    public static void main(String[] args) {
        Ulamek ulamek1 = new Ulamek(3,5);
        Ulamek ulamek2 = new Ulamek(7,15);

        ulamek1.wypisz();

        ulamek1.dodaj(ulamek2);

        ulamek1.wypisz();

        ulamek1.toString();

    }
}
