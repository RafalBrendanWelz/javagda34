package dzien12;

public class SumowanieTablic {
    public static void main(String[] args) {

    }

    public static int sumujRekurencyjnie(int[] tablicaLiczb, int i){
        if(i >= tablicaLiczb.length){
            return 0;
        }
        return tablicaLiczb[i] + sumujRekurencyjnie(tablicaLiczb, i+1);
    }
}
