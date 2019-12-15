package dzien11.inputOutput.Zadanie6_4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile meczów chcesz podać:");
        int iloscMeczow = scanner.nextInt();


        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < iloscMeczow; i++) {
           sb.append(pobierzWynik() + "\n");
        }
        try {
            dopiszWynikDoPliku(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }



    private static void dopiszWynikDoPliku(String wynikDoDopisania) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("wyniki.txt");
        printWriter.append(wynikDoDopisania);
        printWriter.close();
    }

    private static String pobierzWynik() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj druzyne 1:");
        String druzyna1 = scanner.nextLine();
        System.out.println("Podaj ilosc goli strzelona przez druzyne 1");
        String goleDruzyny1 = scanner.nextLine();
        System.out.println("Podaj druzyne 2:");
        String druzyna2 = scanner.nextLine();
        System.out.println("Podaj ilosc goli strzelona przez druzyne 2");
        String goleDruzyny2 = scanner.nextLine();

        if (goleDruzyny1.trim().equalsIgnoreCase(goleDruzyny2.trim())) {
            System.out.println("Podaj karne strzelone przez druzyne 1:");
            String karneDruzyny1 = scanner.nextLine();
            System.out.println("Podaj karne strzelone przez druzyne 2:");
            String karneDruzyny2 = scanner.nextLine();

            return druzyna1 + '<' + goleDruzyny1 + ">(" + karneDruzyny1 + ") : (" + karneDruzyny2 + ")<" + goleDruzyny2 + ">" + druzyna2;
        }

        return druzyna1 + '<' + goleDruzyny1 + ">" + " : " + "<" + goleDruzyny2 + ">" + druzyna2;


    }
}
