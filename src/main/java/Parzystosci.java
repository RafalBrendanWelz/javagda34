import java.util.Scanner;

public class Parzystosci {

    public static void main(String[] args) {

        System.out.println("Podaj liczbe ktora ma byc sprawdzona");
        Scanner scanner = new Scanner(System.in);
        int wczytana = scanner.nextInt();
        drukujParzystoscLiczby(wczytana);



    }

    public static void drukujParzystoscLiczby(int liczbaDoSprwadzenia) {
        if (liczbaDoSprwadzenia % 2 == 0) {
            System.out.println(liczbaDoSprwadzenia + " liczba jest parzysta");
        } else {
            System.out.println(liczbaDoSprwadzenia + " liczba jest nieparzysta");
        }
    }

    public static boolean czyLiczbaJestParzysta(int liczbaDoSprawdzenia) {

        if (liczbaDoSprawdzenia % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean metoda3(int liczba, boolean printFlag) {
        if (printFlag) {
            System.out.println("parzystosc: " + (liczba % 2 == 0));
            return liczba % 2 == 0;
        } else {
            return liczba % 2 == 0;
        }
    }
}
