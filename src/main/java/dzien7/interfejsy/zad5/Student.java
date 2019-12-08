package dzien7.interfejsy.zad5;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numerAlbumu == student.numerAlbumu &&
                Objects.equals(imie, student.imie) &&
                Objects.equals(nazwisko, student.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, numerAlbumu);
    }
}
