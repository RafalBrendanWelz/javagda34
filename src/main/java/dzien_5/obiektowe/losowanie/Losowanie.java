package dzien_5.obiektowe.losowanie;

import java.util.Random;
import java.util.Scanner;

public class Losowanie {


    public void losuj() {
        int minRange, maxRange;
        System.out.println("Podaj prosze dolny zakres");
        minRange = pobierzLiczbe();
        System.out.println("Podaj prosze gorny zakres");
        maxRange = pobierzLiczbe();
        System.out.println(wylosujZZakresu(minRange, maxRange));

    }

    private int pobierzLiczbe() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int wylosujZZakresu(int minRange, int maxRange) {
        Random random = new Random();
        int randomized = random.nextInt(maxRange - minRange + 1) + minRange;
        return randomized;
    }
}
