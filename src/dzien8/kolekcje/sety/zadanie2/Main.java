package dzien8.kolekcje.sety.zadanie2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(10);
        Figura kwadrat2 = new Kwadrat(45);
        Prostokat prostokat = new Prostokat(20);
        Figura prostokat2 = new Prostokat(70);
        Figura prostokat3 = prostokat2;

        Set<Figura> figuraSet = new HashSet<>();

        System.out.println(prostokat.hashCode());
        System.out.println(prostokat2.hashCode());
        System.out.println(prostokat.hashCode());

        figuraSet.add(kwadrat);
        figuraSet.add(kwadrat2);
        figuraSet.add(prostokat);
        figuraSet.add(prostokat2);

        System.out.println(figuraSet);

    }
}
