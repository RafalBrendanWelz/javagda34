package dzien11.wyjatki;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // KontoBankowe kontoBankowe = new KontoBankowe(1000);
        // kontoBankowe.test();

        try {
            System.out.println(czyMozeszJechac(pobierzWzrost()));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorki, ale nie pojedziesz");
        }


    }

    public static int pobierzWzrost() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wzrost:");
        return scanner.nextInt();
    }

    public static boolean czyMozeszJechac(int wzrost) throws Exception {
        if( wzrost > 160){
            return true;
        } else{
            throw new Exception("Jestes za niski!");
        }
    }
}
