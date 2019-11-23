package dzien_5.obiektowe;

public class Main {
    public static void main(String[] args) {

        Pies burek = new Pies("Burek vol.2 ", 2000, "biszkoptowy");

        burek.setImie("Andrzej");



        System.out.println(burek.getImie());



        burek.kolorUmaszczenia = "Szary";
        System.out.println(burek.kolorUmaszczenia);
        burek.turlajSie(true);
        System.out.println(burek.kolorUmaszczenia);



    }
}
