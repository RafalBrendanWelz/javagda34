package dzien7.interfejsy.zad5;

public class Student implements Comparable {
    private String imie, nazwisko;
    private int numerAlbumu;

    public Student(String imie, String nazwisko, int numerAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
    }

    @Override
    public int compareTo(Object o) {
        Student that = (Student) o;
        if (this.numerAlbumu < that.numerAlbumu) {
            return -1;
        } else if (this.numerAlbumu > that.numerAlbumu) {
            return 1;
        } else {
            if (this.nazwisko.compareTo(that.nazwisko) == 0) {
                return this.imie.compareTo(that.imie);
            } else {
                return this.nazwisko.compareTo(that.nazwisko);
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numerAlbumu=" + numerAlbumu +
                '}';
    }
}
