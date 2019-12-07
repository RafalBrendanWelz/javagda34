package dzien9.kolekcje.mapy.hashcode;

import java.util.Objects;

public class Student {

    public Student(String imie, int nrAlbumu) {
        this.imie = imie;
        this.nrAlbumu = nrAlbumu;
    }

    protected String imie;
    protected int nrAlbumu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return nrAlbumu == student.nrAlbumu &&
                Objects.equals(imie, student.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nrAlbumu);
    }
}
