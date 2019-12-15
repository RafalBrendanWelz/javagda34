package dzien12;

public class SumowanieTablic {
    public static void main(String[] args) {
        int[] tablica = {1,2,3,4,5};
        System.out.println(sumujRekurencyjnie(tablica,0));

    }

    public static int sumujRekurencyjnie(int[] tablicaLiczb, int i){
        if(i >= tablicaLiczb.length){
            return 0;
        }
        return tablicaLiczb[i] + sumujRekurencyjnie(tablicaLiczb, i+1);
    }
}
