package dzien12.przeszukiwania;

import java.util.Arrays;

public class MyBinarySearch {
    public static void main(String[] args) {
        int[] tablica =  new int[]{123,65,245,8754,1,54,66};
        Arrays.sort(tablica);

        System.out.println(binarySearch(tablica, 65));

        int x = 10;
        int y = 20;
        System.out.println("value of x:" + x);
        System.out.println("value of y:" + y);
        System.out.println("After swapping");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
    }

    public static int binarySearch(int[] tablica, int szukanaLiczba){
        return binarySearch(tablica,szukanaLiczba, 0, tablica.length-1);
    }

    private static int binarySearch(int[] tablica, int szukanaLiczba, int l, int r) {
        int mid = (l + r) / 2;

        if (l <= r) {
            mid = (r + l) / 2;

            // jezeli szukana liczba jest na srodku, zwroc indeks
            if (tablica[mid] == szukanaLiczba) {
                return mid;
            }
            // jeli srodek jest mniejszy
            // od szukanej, to szukamy w prawej czesci tablicy
            if (tablica[mid] < szukanaLiczba) {
               return binarySearch(tablica,szukanaLiczba,mid + 1, r);
            } else { // jezeli wejdziemy w elsa, to znaczy, ze szukana jest w lewej czesci tablicy
                return binarySearch(tablica,szukanaLiczba,l, mid -1);
            }
        }
        return -1;

    }


}
