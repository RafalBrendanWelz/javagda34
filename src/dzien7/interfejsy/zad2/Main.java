package dzien7.interfejsy.zad2;

public class Main {

    public static void main(String[] args) {
        Dzwoni telefon = new Telefon("123 123 123");

        for (int i = 0; i < 100; i++) {
            telefon.zadzwonNaNumerAlarmowy();
        }
    }
}
