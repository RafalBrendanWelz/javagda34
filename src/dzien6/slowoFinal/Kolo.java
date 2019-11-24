package dzien6.slowoFinal;

public class Kolo {
    protected double promien;
    protected final double PI = 3.14;

    public Kolo(final double promien) {
        promien *=2;

        this.promien = promien;
    }

    public final double obliczPole() {
        return PI * promien * promien;
    }

    public final double obliczPole(int a){
        return 2;
    }

    public final double obliczPole(double a){
        return 2;
    }
}
