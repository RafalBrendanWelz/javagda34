package dzien10.zadanieStreamySklep;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Samochod> listaSamochodowDlaSklepu = Arrays.asList(
                new Samochod("Audi","Czarne","Q3",100000,2),
                new Samochod("Audi","Czerwone","Q5",150000,3),
                new Samochod("Audi","Czarne","A3",20000,10),
                new Samochod("Audi","Czarne","A5",15000,15),
                new Samochod("Audi","Rdzawym","80",1000,20),
                new Samochod("Porshe","Srebrny","Cayenne",500000,0)
        );

        Sklep dealer = new Sklep(listaSamochodowDlaSklepu);
        dealer.pracuj();




    }
}
