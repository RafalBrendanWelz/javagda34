package dzien8.para;

public class Para <T> {
    private T lewy;
    private T prawy;

    String opis;

    public Para(T lewy ,T prawy, String opis){
        this.lewy = lewy;
        this.prawy = prawy;

        this.opis = opis;
    }

    public T getLewy() {
        return lewy;
    }

    public T getPrawy() {
        return prawy;
    }

    public String getOpis() {
        return opis;
    }
}
