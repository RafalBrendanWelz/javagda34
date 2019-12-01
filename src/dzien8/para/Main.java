package dzien8.para;



public class Main {
    public static void main(String[] args) {

        Para<String> parka = new Para("Kaisa","Jan", "Poznali sie na majorce");

        Para<Integer> paraIntow = new Para(10,351, "Para losowych liczb");


        String wynik = parka.getLewy();

        Integer wynik2 = paraIntow.getLewy();


    }
}
