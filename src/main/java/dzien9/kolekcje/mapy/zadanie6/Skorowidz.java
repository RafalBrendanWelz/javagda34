package dzien9.kolekcje.mapy.zadanie6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Skorowidz {

    public static Map<String, Set<Integer>> skorowidzLiterowy(String tekst) {
        String [] tablicaLiter = tekst.split("");
        Map<String, Set<Integer>> skorowidz = new HashMap<>();

        for (int i = 0; i < tablicaLiter.length ; i++) {
            if(skorowidz.containsKey(tablicaLiter[i])){
                skorowidz.get(tablicaLiter[i]).add(i);
            } else {
                skorowidz.put(tablicaLiter[i], new HashSet<Integer>());
                skorowidz.get(tablicaLiter[i]).add(i);
            }
        }

        return skorowidz;
    }
}
