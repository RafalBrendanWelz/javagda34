package dzien12.sortowanie;

public class CountSort {
    public static void main(String[] args) {
        int [] tablicaDoPosortowania = new int[]{45,65,1,99,2,8,70};
        tablicaDoPosortowania = countSort(tablicaDoPosortowania,100);

        for (int i = 0; i < tablicaDoPosortowania.length; i++) {
            System.out.println(tablicaDoPosortowania[i]);
        }

    }

    public static int[] countSort(int[] doPosortowania, int zakres) {
        int[] tablicaWystapien = new int[zakres];

        for(int i =0; i< doPosortowania.length; i++){
            tablicaWystapien[doPosortowania[i]]++;
        }

        int licznikDlaTabeli = 0;
        for(int i = 0; i< tablicaWystapien.length; i++){
            for(int j =0; j< tablicaWystapien[i]; j++){
                doPosortowania[licznikDlaTabeli] = i;
                licznikDlaTabeli++;
            }
        }
        return doPosortowania;
    }
}
