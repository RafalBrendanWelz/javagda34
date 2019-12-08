package dzien7.interfejsy.zad3;

public class Main {

    public static void main(String[] args) {

        Jedzacy[] tablicaJedzacych = new Jedzacy[3];

        Jedzacy andrzej = new Programista();
        Jedzacy dandiKrokodyl = new Krokodyl();
        Jedzacy weganin = new Weganin();


        tablicaJedzacych[0] = andrzej;
        tablicaJedzacych[1] = dandiKrokodyl;
        tablicaJedzacych[2] = weganin;


        Pokarm antylopa = new Pokarm("antylopa", TypPokarmu.MIESO, 60000d);
        Pokarm banan = new Pokarm("banan", TypPokarmu.OWOCE, 250d);
        Pokarm twarozek = new Pokarm("twarog wiejski", TypPokarmu.NABIAL, 200d);

        System.out.println("Pierwsza runda karmienia");
        for(int i=0; i < tablicaJedzacych.length; i++){
            tablicaJedzacych[i].jedz(antylopa);
            tablicaJedzacych[i].jedz(banan);
            tablicaJedzacych[i].jedz(twarozek);
        }


        System.out.println("Druga runda karmienia");
        for(int i=0; i < tablicaJedzacych.length; i++){
            tablicaJedzacych[i].jedz(twarozek);

        }

        int indeksWygranego = znajdzIndeksJedzacegoZNajwiekszaLiczbaPosilkow(tablicaJedzacych);

        System.out.println("Najwieksza ilosc posilkow zjadl: " + tablicaJedzacych[indeksWygranego]);


    }

    static private int znajdzIndeksJedzacegoZNajwiekszaLiczbaPosilkow(Jedzacy[] tablicaDoPrzeszukania){
        int maxPosilkow = -1;
        int indeksMaxPosilkow = -1;

        for(int i=0; i<tablicaDoPrzeszukania.length; i++){
             if(tablicaDoPrzeszukania[i].ilePosilkowZjedzone() > maxPosilkow){
                 maxPosilkow = tablicaDoPrzeszukania[i].ilePosilkowZjedzone();
                 indeksMaxPosilkow = i;
             }
        }

        return indeksMaxPosilkow;
    }


}
