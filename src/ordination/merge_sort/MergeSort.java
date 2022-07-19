package ordination.merge_sort;

import ordination.introdution.Introduction;

import java.util.Arrays;

public class MergeSort {
    public static void startMergeSort(int[] numbers, int[] aux, int initial, int finish) {
        System.out.println("==== Algorithm Merge Sort Ordination ====");
        long startAt = System.currentTimeMillis();

        mergeSort(numbers, aux, initial, finish);

        System.out.println("Duration Merge Sort: " + Introduction.finishAt(startAt) + " ms");
        //System.out.println("Números ordenados: " + Arrays.toString(numbers));
        System.out.println("==================================================================================");
        System.out.println();
    }

    private static void mergeSort(int[] numbers, int[] aux, int initial, int finish) {
        if (initial < finish) {
            int middle = (initial + finish) / 2;
            mergeSort(numbers, aux, initial, middle);
            mergeSort(numbers, aux, middle + 1, finish);
            intercalation(numbers, aux, initial, middle, finish);
        }
    }

    private static void intercalation(int[] numbers, int[] aux, int initial, int middle, int finish) {

        if (finish + 1 - initial >= 0) System.arraycopy(numbers, initial, aux, initial, finish + 1 - initial);

        int i = initial;
        int j = middle + 1;

        for (int k = initial; k <= finish; k++) {
            if (i > middle) numbers[k] = aux[j++];
            else if (j > finish) numbers[k] = aux[i++];
            else if (aux[i] < aux[j]) numbers[k] = aux[i++];
            else numbers[k] = aux[j++];
        }
    }
}