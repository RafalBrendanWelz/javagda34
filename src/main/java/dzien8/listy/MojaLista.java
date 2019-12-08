package dzien8.listy;


import java.util.ArrayList;
import java.util.List;

public class MojaLista<E> {

    E[] tablica;

    public MojaLista(int rozmiar) {
        this.tablica = (E[]) (new Object[rozmiar]);
    }

    public boolean zawiera(E element) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i].equals(element)) {
                return true;
            }
        }
        return false;
    }


}
