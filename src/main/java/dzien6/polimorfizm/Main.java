package dzien6.polimorfizm;

import dzien6.polimorfizm.symulator.Kolo;
import dzien6.polimorfizm.symulator.SymulatorFarby;

public class Main {
    public static void main(String[] args) {

        Kolo kolo = new Kolo(5);
        Kwadrat kwadrat = new Kwadrat(10);
        Prostokat prostokat = new Prostokat(10,20);

        Figura[] tablicaFigur = {kolo,kwadrat,prostokat};

        System.out.println(SymulatorFarby.obliczZapotrzebowanieNaFarbe(tablicaFigur, 10));
    }
}
