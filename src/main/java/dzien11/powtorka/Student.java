package dzien11.powtorka;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    public static int wiek = 10;
    String imie;
    String nazwisko;
    int indeks;
}
