package dzien_5.obiektowe.enumy;

public class Main {
    public static void main(String[] args) {

        Bilet normalny = Bilet.NORMALNY;
        Bilet ulgowy = Bilet.ULGOWY;



        System.out.println(ulgowy);
        System.out.println(Bilet.ULGOWY.getCena());

        System.out.println(normalny);
        System.out.println(normalny.getCena());


    }
}
