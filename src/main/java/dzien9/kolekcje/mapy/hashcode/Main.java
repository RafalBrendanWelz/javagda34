package dzien9.kolekcje.mapy.hashcode;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> wystapieniaSlow = new HashMap<>();

        String zlaczony = "Ala ma kota ala ma";
        String[] slowa = zlaczony.toLowerCase().split(" ");

        for (int i = 0; i < slowa.length; i++){
            if(wystapieniaSlow.containsKey(slowa[i])){
                wystapieniaSlow.put(slowa[i], wystapieniaSlow.get(slowa[i]) + 1);
            } else {
                wystapieniaSlow.put(slowa[i], 1);
            }
        }

        System.out.println(wystapieniaSlow);

        Collection<Integer> listaintow = new ArrayList<>();
        listaintow = wystapieniaSlow.values();

        System.out.println(listaintow);

        listaintow.toArray();

    }
}
