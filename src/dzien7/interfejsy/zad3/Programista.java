package dzien7.interfejsy.zad3;

public class Programista implements Jedzacy{
    private int iloscPosilkowWZyciu;
    private double lacznaWagaZjedzonychPosilkow;

    public Programista() {
        this.iloscPosilkowWZyciu = 0;
        this.lacznaWagaZjedzonychPosilkow = 0;
    }
    @Override
    public void jedz(Pokarm pokarm) {
        if (pokarm.getTypPokarmu() == TypPokarmu.NABIAL){
            System.out.println("Programista: om nom nom, pyszne" + pokarm.getTypPokarmu());
            this.iloscPosilkowWZyciu++;
            this.lacznaWagaZjedzonychPosilkow += pokarm.getWaga();
        }
    }

    @Override
    public int ileGramowZjedzone() {
        return 0;
    }

    @Override
    public int ilePosilkowZjedzone() {
        return 0;
    }

    @Override
    public String toString() {
        return "Programista{" +
                "iloscPosilkowWZyciu=" + iloscPosilkowWZyciu +
                ", lacznaWagaZjedzonychPosilkow=" + lacznaWagaZjedzonychPosilkow +
                '}';
    }
}
