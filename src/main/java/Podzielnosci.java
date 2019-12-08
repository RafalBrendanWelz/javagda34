import java.util.Scanner;

public class Podzielnosci {

    public static void main(String[] args) {
        int[] tablicaLiczb;
        tablicaLiczb = wczytajLiczby();

        boolean czyPodzielna = sprawdzPodzielnosc(tablicaLiczb[0], tablicaLiczb[1]);

        wypiszCzyPodzielna(czyPodzielna);

    }

    public static int[] wczytajLiczby() {
        System.out.println("Podaj liczbe ktorej podzielnosc chcesz sprawdzic:");
        Scanner scanner = new Scanner(System.in);
        int liczbaDoPodzielenia = scanner.nextInt();

        System.out.println("Podaj liczbe przez ktora mam dzielic:");
        int dzielnik = scanner.nextInt();

        int[] tablicaDanych = new int[]{liczbaDoPodzielenia, dzielnik};

        return tablicaDanych;
    }

    public static boolean sprawdzPodzielnosc(int liczbaDoPodzielenia, int dzielnik) {
        return ((liczbaDoPodzielenia % dzielnik) == 0);
    }

    public static void wypiszCzyPodzielna(boolean czyParzysta) {

        if (czyParzysta) {
            System.out.println("Ta liczba dzieli sie przez zadany dzielnik bez reszty");
        } else {
            System.out.println("Liczba ta nie dzieli sie przez zadany dzielnik bez reszty");
        }

    }
}
