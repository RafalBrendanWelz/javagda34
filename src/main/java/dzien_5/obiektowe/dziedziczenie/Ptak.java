package dzien_5.obiektowe.dziedziczenie;

public class Ptak {
    double rozpietoscSkrzydel;
    String umaszczenie;

    public Ptak(){

    }

    public Ptak(double rozpietoscSkrzydel, String umaszczenie) {
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
        this.umaszczenie = umaszczenie;
    }

    public void dajGlos(){
        System.out.println("Cwir Cwir");
    }
}
