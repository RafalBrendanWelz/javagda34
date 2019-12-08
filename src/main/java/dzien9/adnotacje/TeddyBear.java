package dzien9.adnotacje;

public class TeddyBear {

    @MaxLength(maxLength = 5)
    String ksywka;

    @MaxLength(maxLength = 1)
    String producent;

    public TeddyBear(String ksywka, String producent) {
        setKsywka(ksywka);
        setProducent(producent);
    }

    public String getKsywka() {
        return ksywka;
    }

    public void setKsywka(String ksywka) {
        this.ksywka = ksywka;
        try {
            if(TeddyBearValidator.validate(this) == false){
                throw new IllegalArgumentException("Zla dlugosc Stringa w polu Ksywka");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
        try {
            if(TeddyBearValidator.validate(this) == false){
                throw new IllegalArgumentException("Zla dlugosc Stringa w polu Prducent");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
