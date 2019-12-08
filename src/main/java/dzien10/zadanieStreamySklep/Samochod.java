package dzien10.zadanieStreamySklep;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Samochod {
    protected String marka;
    protected String kolor;
    protected String model;
    protected double cena;
    protected int wiek;
}
