import java.util.Scanner;

public class MainParzystosci {

    public static void main(String[] args) {



        // wywoalnie metody joinTogether wraz przekazaniem 3 argumentow
        String result = joinTogether("Ala ma kota", '&', 12371);

        // wyswietlenie wyniku zapisanego w zmiennej result
        System.out.println(result);

        // deklaracja 4-elementowej tablicy Stringow
        String [] tablicaWynikow = new String[4];

        // zapisanie wyniku do tablicy
        tablicaWynikow[0] = result;


    }


    public static String joinTogether(String base, char character, int number) {
        String joined = base + character + number;

        //zwrocenie wyniku operacji
        return joined;
    }

    public static String[] returnAla() {

        String[] tablicaWiadomosci = new String[2];

        String wierszyk = "Ala ma kota";
        String imie = "Marcin";

        tablicaWiadomosci[0] = wierszyk;
        tablicaWiadomosci[1] = imie;

        // zwrocenie tablicy Stringow
        return tablicaWiadomosci;

    }


    public static void powitanieSwiata() {
        // ta metoda tylko wyswietla tekst na ekranie
        System.out.println("Witaj! Jesteś w metodzie 'powitanie()'");
    }

    public void metodaXYZ(){

    }
}
