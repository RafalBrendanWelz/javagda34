package dzien6.dziedziczenie.samochody;

public class Kabriolet extends Samochod {
    protected boolean dach;

    public Kabriolet(double predkosc, boolean swiatla, boolean dach) {
        super(predkosc, swiatla);
        this.dach = dach;
    }


    public void schowajDach(){
        this.dach = false;
    }

    public boolean czyDachSchowany(){
        return dach;
    }

}
