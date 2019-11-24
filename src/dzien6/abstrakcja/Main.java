package dzien6.abstrakcja;

import dzien6.slowoFinal.Kolo;

public class Main {
    public static void main(String[] args) {


        Kukulka kukulka = new Kukulka(10,true,"czarne",4);

        Ptak ptaszek =  new Kukulka(10,true,"czarne",4);

        ptaszek.dajGlos();

        System.out.println(kukulka.toString());
    }
}
