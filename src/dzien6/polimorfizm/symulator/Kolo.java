package dzien6.polimorfizm.symulator;

import dzien6.polimorfizm.Figura;

public class Kolo extends Figura {
    double promien;
    final double PI = 3.14;

    public Kolo(double promien){
        this.promien = promien;
    }

    @Override
    public double obliczPole() {
        return promien*promien*PI;
    }
}
