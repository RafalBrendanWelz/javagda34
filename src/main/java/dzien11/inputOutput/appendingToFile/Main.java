package dzien11.inputOutput.appendingToFile;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter(
                    new FileOutputStream(new File("plik.txt"),true)
            );
            printWriter.append("Cos nowego \n poniezej");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
