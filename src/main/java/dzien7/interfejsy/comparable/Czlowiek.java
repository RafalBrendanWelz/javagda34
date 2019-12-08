package dzien7.interfejsy.comparable;

public class Czlowiek implements Comparable{
    private int wiek;
    private String imie;



    @Override
    public int compareTo(Object o) {
        Czlowiek that = (Czlowiek) o;
        return this.imie.compareTo(that.imie);

    }



    public Czlowiek(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }


    @Override
    public String toString() {
        return "Czlowiek{" +
                "wiek=" + wiek +
                ", imie='" + imie + '\'' +
                '}';
    }
}
