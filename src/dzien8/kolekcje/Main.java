package dzien8.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Ala");
        lista.add("ma");
        lista.add("ma");
        lista.add("ma");
        lista.add("kota");

        wyswietlDuplikaty(lista);


    }

    public static void wyswietlDuplikaty(List<String> listaDoPrzeszukania) {
        List<String> duplikaty = new ArrayList<>();

        for (int i = 0; i < listaDoPrzeszukania.size(); i++) {
            if (listaDoPrzeszukania.lastIndexOf(listaDoPrzeszukania.get(i)) != i) {
                duplikaty.add(listaDoPrzeszukania.get(i));
            }

        }





        System.out.println(duplikaty);


    }
}
