package dzien6.dziedziczenie.zwierzeta;

import java.util.Objects;

public class Ptak extends Zwierze {
    double rozpietoscSkrzydel;


    public Ptak(String umaszczenie, double rozpietoscSkrzydel) {
        super(umaszczenie);
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
    }



    protected void dajGlos() {
        System.out.println("Cwir Cwir");


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Ptak ptak = (Ptak) o;
        if (this.rozpietoscSkrzydel == ptak.rozpietoscSkrzydel && this.umaszczenie.equals(ptak.umaszczenie)) {
            return true;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(rozpietoscSkrzydel);
    }
}
