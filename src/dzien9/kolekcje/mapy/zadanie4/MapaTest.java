package dzien9.kolekcje.mapy.zadanie4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapaTest {

    public static void main(String[] args) {

        Map<String, Integer> mapaImieWiek = new TreeMap<>();

        mapaImieWiek.put("Ala", 21);
        mapaImieWiek.put("Alan", 1);
        mapaImieWiek.put("Jan", 40);
        mapaImieWiek.put("Jadwiga", 60);
        mapaImieWiek.put("Alan", 100);

        System.out.println("Ala".hashCode());
        System.out.println("Ala".hashCode());
        System.out.println("Alan".hashCode());


        for (String klucz : mapaImieWiek.keySet()) {
            System.out.println("Klucz: " + klucz + ", wartosc: " + mapaImieWiek.get(klucz));
        }

    }
}
