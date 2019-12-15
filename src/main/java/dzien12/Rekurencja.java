package dzien12;

public class Rekurencja {
    public static void main(String[] args) {
        metodaA();



        //recursive();
    }

    private static void metodaA() {
        System.out.println("Jestem w metodzie A");
        metodaB();
        return;
    }

    private static void metodaB() {
        System.out.println("Jestem w metodzie B");
        return;
    }

    public static void recursive(){
        System.out.println("Jestem w funkcji rekurencyjnej");
        recursive();
    }
}
