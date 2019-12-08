package dzien_5.obiektowe.bank;

public class KontoBankowe {
    // pola klasy
    protected long numerKonta; // jak dziala modyfikator dostepu protected?
    private long stanKonta; // jak dziala modyfikator dostepu private?

    private boolean sprwadzCzyStanKontaPonadDebetem(){ // kto moze uzywac tej metody, skoro jest private?
        if(stanKonta>0) {
            return true;
        } else {
            return false;
        }
    }

    public void przelewWychodzacy(KontoBankowe kontoOdbiocy, long kwotaPrzelewu){ // gdzie mozna uzywac metod publicznych? (Wszedzie.)

        if(sprwadzCzyStanKontaPonadDebetem() == true){
            this.stanKonta -= kwotaPrzelewu;
            kontoOdbiocy.stanKonta += kwotaPrzelewu;
        }

    }

    public long getNumerKonta() { //getter do pola 'numerKonta'
        return numerKonta;
    }

    public long getStanKonta() { //getter do pola 'stanKonta'
        return stanKonta;
    }

    public KontoBankowe(long numerKonta, long stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
    } // konstruktor
}
