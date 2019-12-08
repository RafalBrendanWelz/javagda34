package dzien6.polimorfizm;

public class Prostokat extends Figura {
    protected double bokA;
    private double bokB;

    public Prostokat(double bokA, double bokB){
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public double obliczPole() {
        return bokA * bokB;
    }
}
