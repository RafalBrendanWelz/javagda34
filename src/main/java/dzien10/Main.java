package dzien10;

import dzien7.interfejsy.zad2.Dzwoni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaObecnosci = new ArrayList<>();
        listaObecnosci.add("alan");
        listaObecnosci.add("zygmunt");
        listaObecnosci.add("ola");


        listaObecnosci.stream()
                .filter(a -> a.length() >5 || a.length() < 10);


        Collections.sort(listaObecnosci, (str1, str2) -> Integer.compare(str2.length(),str1.length()));

        System.out.println(listaObecnosci);
    }
}
