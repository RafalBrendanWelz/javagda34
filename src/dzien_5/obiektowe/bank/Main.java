package dzien_5.obiektowe.bank;

public class Main {

    public static void main(String[] args) {
        KontoBankowe andrzeja = new KontoBankowe(123l, 100l);

        KontoBankowe beaty = new KontoBankowe(444l, 1000000l);

        KontoBankowe cwaniaczka = new KontoBankowe(666l, 0l);

        andrzeja.przelewWychodzacy(beaty,1l);

        System.out.println(andrzeja.numerKonta);


        cwaniaczka.stanKonta = beaty.stanKonta; // to nie dziala po zastosowaniu enkapsulacji
    }
}
