package dzien7.interfejsy.zad5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student jan = new Student("Jan", "Kowalski", 123);
        Student ewa = new Student("Ewa", "Stan", 500);
        Student artur = new Student("Dartur", "Nowak", 1);
        Student brian = new Student("Brian", "Nowak", 1);


        Student[] dziennikStudentow = {jan, ewa, artur, brian};

        for (Student biezacy: dziennikStudentow) {
            System.out.println(biezacy);
        }

        Arrays.sort(dziennikStudentow);

        System.out.println("Po sortowaniu:");
        for (Student biezacy: dziennikStudentow) {
            System.out.println(biezacy);
        }












    }
}
