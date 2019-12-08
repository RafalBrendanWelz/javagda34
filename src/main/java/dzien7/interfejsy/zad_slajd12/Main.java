package dzien7.interfejsy.zad_slajd12;

public class Main {
    public static void main(String[] args) {
        Instrumentalny beben = new Beben();
        Instrumentalny gitara = new Gitara();
        Instrumentalny pianino = new Pianino();

        Instrumentalny[] instrumenty = {beben, gitara, pianino};

        for (int i = 0; i < instrumenty.length; i++) {
            instrumenty[i].graj();
        }
    }

}
