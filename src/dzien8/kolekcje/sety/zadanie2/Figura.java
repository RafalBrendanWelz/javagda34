package dzien8.kolekcje.sety.zadanie2;

public abstract class Figura {
    protected double pole;

    public Figura(double pole) {
        this.pole = pole;
    }

    public abstract double obliczPole();

    

    @Override
    public String toString() {
        return "Figura{" +
                "pole=" + pole +
                '}';
    }
}
