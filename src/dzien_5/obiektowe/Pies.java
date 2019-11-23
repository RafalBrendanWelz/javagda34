package dzien_5.obiektowe;

import java.util.Date;

public class Pies {
    private String imie;
    private int rokUrodzenia;
    private String kolorUmaszczenia;


    public String getImie(){
        return imie;
    }

    public void setImie(String imie){
        this.imie = imie;
    }


    public Pies(String imie, int rokUrodzenia, String kolorUmaszczenia){

        this.rokUrodzenia = rokUrodzenia;
        this.kolorUmaszczenia = kolorUmaszczenia;
    }


    public void dajGlos() {


        System.out.println("Hau Hau!");
    }

    public void podajLape() {

        System.out.println("Podaje lape!");
    }

    public String aportuj() {
        return "Kij";
    }

    public void turlajSie(boolean czyPiesChce) {
        if (czyPiesChce) {
            kolorUmaszczenia = "brudny";
            System.out.println("Turlam sie!");
        } else {
            System.out.println("Pies sie nie chce turalac");
        }
    }
}
