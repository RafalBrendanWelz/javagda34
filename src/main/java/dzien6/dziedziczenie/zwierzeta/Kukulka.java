package dzien6.dziedziczenie.zwierzeta;

public class Kukulka extends Ptak {

    public Kukulka(String umaszczenie, double rozpietoscSkrzydel) {
        super(umaszczenie, rozpietoscSkrzydel);
    }

    @Override
    public String toString() {
        return "Kukulka{" +
                "rozpietoscSkrzydel=" + rozpietoscSkrzydel +
                ", umaszczenie='" + umaszczenie + '\'' +
                '}';
    }

    @Override
    protected void dajGlos(){
        super.dajGlos();
        System.out.println("a tutaj cos swojego, dodatkowo");
    }


}
