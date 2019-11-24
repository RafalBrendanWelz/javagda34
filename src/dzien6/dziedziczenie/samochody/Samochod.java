package dzien6.dziedziczenie.samochody;

public class Samochod {
    protected double predkosc;
    protected boolean swiatla;
    private final int finalnyPrymityw =1;

    private final Kabriolet finalnyKabrio = new Kabriolet(12,false,false);


    public Samochod(double predkosc, boolean swiatla, int finalnyPrymityw) {
        this.predkosc = predkosc;
        this.swiatla = swiatla;
        //this.finalnyPrymityw = finalnyPrymityw;

    }

    public Samochod(double predkosc, boolean swiatla) {

    }


    public final void przyspiesz(){
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
