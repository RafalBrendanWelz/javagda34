package dzien10.pokazStreamMap;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class Main {
    public static void main(String[] args) {
        Wesz wsza = new Wesz(10);
        Pies burek = new Pies("Burek", wsza);
        Czlowiek czlowiek = new Czlowiek(burek,"Jan");

        List<Czlowiek> czlowieki = Arrays.asList(czlowiek);









        ZakladPracy stocznia = new ZakladPracy(czlowieki);


        Long listaRozmiaowWszy = stocznia.getPracownicy().stream()
                .filter(c -> c.getImie().equalsIgnoreCase("jan"))
                .map(c ->  c.getPies().getWsza().getRozmiar())
                .collect(Collectors.counting());

        //System.out.println(listaRozmiaowWszy);


        Optional<String> optional = Optional.ofNullable("Nie pusta wartosc ");

        String wynikSrodkaOptionala = optional.orElseGet(() -> metoda());

        System.out.println(wynikSrodkaOptionala);

    }

    public static String metoda(){
        System.out.println("Jestem w oinnej metodzie");
        return "wartosc";
    }
}
