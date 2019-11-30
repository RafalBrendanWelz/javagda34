package dzien7.interfejsy.zad4;

public interface Grzeje {
    double pobierzTemp();
    void zwiekszTemp();

    default void wyswietlTemp(){
        System.out.println("W pomieszczeniu jest" + pobierzTemp() + " stopni" );
    }


}
