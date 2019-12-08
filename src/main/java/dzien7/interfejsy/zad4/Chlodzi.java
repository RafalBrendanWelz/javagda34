package dzien7.interfejsy.zad4;

public interface Chlodzi {
    double pobierzTemp();
    void schlodz();

    default void wyswietlTemp(){
        System.out.println("W pomieszczeniu jest" + pobierzTemp() + " stopni" );
    }


}
