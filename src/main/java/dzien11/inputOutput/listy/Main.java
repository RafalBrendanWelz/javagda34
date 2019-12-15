package dzien11.inputOutput.listy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("plik.txt");
        Scanner wejscie = new Scanner(file);
        List<String> listaLinii = new ArrayList<>();

        while(wejscie.hasNextLine()){
            listaLinii.add(wejscie.nextLine());
        }


        System.out.println(listaLinii);


        List<String> listaStringow = new ArrayList<>();
        listaStringow.add("asd");
        listaStringow.add("asd");
        listaStringow.add("asd");


        PrintWriter printWriter = new PrintWriter(new File("plik.txt"));
        for(String s : listaStringow){
            printWriter.append(s+"\n");
        }
        printWriter.close();



    }
}
