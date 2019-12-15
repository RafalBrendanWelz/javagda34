package dzien11.wyjatki;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // KontoBankowe kontoBankowe = new KontoBankowe(1000);
        // kontoBankowe.test();

        try { // wyjatek dziedziczy po RuntimeException - nie trzeba wiec try...catch
            System.out.println(czyMozeszJechac(pobierzWzrost()));
        } catch (InsufficientHeightException e) {
            e.printStackTrace();
        }

        System.out.println("cokol\\nwiek");

        try {
            FileWriter fileWriter = new FileWriter("plik.txt");
            fileWriter.append("\nasdasd");
            fileWriter.append("\nasdasd");
            fileWriter.append("\nasdasd");
            fileWriter.append("\nasdasd");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static int pobierzWzrost() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wzrost:");
        return scanner.nextInt();
    }

    public static boolean czyMozeszJechac(int wzrost) throws InsufficientHeightException{
        if (wzrost > 160) {
            return true;
        } else {
            throw new InsufficientHeightException("Niewystarczajacy wzrost");
        }
    }
}
