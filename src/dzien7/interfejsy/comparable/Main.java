package dzien7.interfejsy.comparable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Czlowiek andrzej = new Czlowiek(60,"Andrzej");
        Czlowiek dziecko = new Czlowiek(2,"Brianek");
        Czlowiek gosia = new Czlowiek(35,"Malgorzata");


        Czlowiek[] tablicaCzlowiekow = {gosia, andrzej,dziecko};

        //Arrays(tablicaCzlowiekow);


        System.out.println(tablicaCzlowiekow[0]);
        System.out.println(tablicaCzlowiekow[1]);
        System.out.println(tablicaCzlowiekow[2]);




    }


}
