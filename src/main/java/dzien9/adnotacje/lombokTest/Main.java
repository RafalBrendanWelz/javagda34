package dzien9.adnotacje.lombokTest;

public class Main {

    public static void main(String[] args) {

        String zdanie = "ala ma kota";


        Student jan = new Student("Imie", 12);
        jan.getImie();
        jan.getWiek();

        System.out.println(sumuj(1, 2, 3, 1, 1, 3, 2, 1));

    }

    public static int sumuj(int... parametry){
        int wynik =0;

        for (int i : parametry) {
            wynik += i;
        }
        return wynik;

    }
}
