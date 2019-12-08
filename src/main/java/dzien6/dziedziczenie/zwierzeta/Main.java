package dzien6.dziedziczenie.zwierzeta;

public class Main {

    public static void main(String[] args) {



        Ptak ptak = new Ptak("brazowy", 2);
        Ptak bociek = new Ptak("brazowy",22);


        System.out.println(ptak.equals(bociek));
    }
}
