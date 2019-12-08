package dzien8.garaz;

public class Main {

    public static void main(String[] args) {

        Samochod bmwx5 = new BMW("X5", "czerwony");
        Samochod porsheCayenne = new Porshe("Cayenne","Czarne");

        Garaz<Samochod> mojGaraz = new Garaz<>(bmwx5,porsheCayenne);

        mojGaraz.wyprowadz(bmwx5);
        mojGaraz.wyprowadz(bmwx5);

        Samochod stary = new BMW("E20", "bordowe");

        mojGaraz.zaparkuj(stary);









    }


    public void utworzTabliceOZadanymRozmiarze( int rozmiar){
        String [] tablica = new String[rozmiar];


    }
}
