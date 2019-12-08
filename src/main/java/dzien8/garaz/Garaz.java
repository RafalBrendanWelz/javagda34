package dzien8.garaz;

public class Garaz<T extends Samochod> {

    private T miejsceLewe;
    private T miejscePrawe;

    public void zaparkuj(T auto) {
        if (miejsceLewe == null) {
            miejsceLewe = auto;
        } else if (miejscePrawe == null) {
            miejscePrawe = auto;
        } else {
            System.out.println("Brak miejsc w garazu!");
        }
    }

    public boolean wyprowadz(T auto) {
        if (miejsceLewe != null && miejsceLewe.equals(auto)) {
            miejsceLewe = null;
            System.out.println("Wyprowadzilem auto: " + auto.toString());
            return true;
        } else if (miejscePrawe != null && miejscePrawe.equals(auto)) {
            miejscePrawe = null;
            System.out.println("Wyprowadzilem auto: " + auto.toString());
            return true;
        } else {
            System.out.println("Nie ma w garazu twojego auta");
            return false;
        }

    }


    public Garaz(T miejsceLewe, T miejscePrawe) {
        this.miejsceLewe = miejsceLewe;
        this.miejscePrawe = miejscePrawe;
    }

    public T getMiejsceLewe() {
        return miejsceLewe;
    }

    public T getMiejscePrawe() {
        return miejscePrawe;
    }

    @Override
    public String toString() {
        return "Garaz{" +
                "miejsceLewe=" + miejsceLewe +
                ", miejscePrawe=" + miejscePrawe +
                '}';
    }
}
