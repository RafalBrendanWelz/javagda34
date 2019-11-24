package dzien6.dziedziczenie.samochody;

public class Samochod {
    protected double predkosc;
    protected boolean swiatla;

    public Samochod(double predkosc, boolean swiatla) {
        this.predkosc = predkosc;
        this.swiatla = swiatla;
    }

    public void przyspiesz(){
        if(this.predkosc <= 110){
            this.predkosc += 10;
            System.out.println("Przyspieszam do " + this.predkosc + "km/h");
        } else {
            System.out.println("Szybciej nie moge!");
        }
    }

    public void przelaczSwiatla(){
        this.swiatla = !this.swiatla;
    }

    public boolean czySwiatlaWlaczone(){
        return this.swiatla;
    }

}
