package dzien6.abstrakcja;

public class Kukulka extends Ptak {
    private int iloscPodrzuconychJajek;

    public Kukulka(int iloscPodrzuconychJajek, boolean ogon, String umaszczenie, int iloscKonczyn) {
        super(ogon,umaszczenie,iloscKonczyn);
        this.iloscPodrzuconychJajek = iloscPodrzuconychJajek;
    }

    @Override
    public String toString() {
        return "Kukulka{" +
                "iloscPodrzuconychJajek=" + iloscPodrzuconychJajek +
                ", ogon=" + ogon +
                ", umaszczenie='" + umaszczenie + '\'' +
                ", iloscKonczyn=" + iloscKonczyn +
                '}';
    }

    @Override
    public void dajGlos() {
        System.out.println("Ku ku");
    }
}
