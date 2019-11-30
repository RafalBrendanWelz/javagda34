package dzien7.interfejsy.zad5;

public class Student implements Comparable{
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
        if(this.numerAlbumu > that.numerAlbumu){
            return -1;
        } else if (this.numerAlbumu < that.numerAlbumu){
            return 1;
        } else {
            return 0;
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
