package dzien12.sortowanie;

public class SelectionSort {
    public static void main(String[] args) {
        int[] tablica =  new int[]{123,65,245,8754,1,54,66};
        int[] posortowana = sort(tablica);
        for (int s: posortowana) {
            System.out.println(s);
        }
    }

    public static int[] sort(int[] doPosortowania) {
        for (int i = 0; i < doPosortowania.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < doPosortowania.length; j++){
                if(doPosortowania[j] < doPosortowania[minIndex]){
                    minIndex = j;
                }
            }
            int temp = doPosortowania[minIndex];
            doPosortowania[minIndex] = doPosortowania[i];
            doPosortowania[i] = temp;
        }
        return doPosortowania;
    }
}
