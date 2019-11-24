package dzien_5.obiektowe.dziedziczenie;

public class Main {
    public static void main(String[] args) {
        Ptak ptaszek = new Ptak();
        ptaszek.dajGlos();

        Ptak inny = new Ptak(1.0d, "szary");
        inny.dajGlos();
    }
}
