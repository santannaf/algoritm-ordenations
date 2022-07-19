package ordination.insert_sort;

import ordination.introdution.Introduction;

public class InsertSort {
    public static void insertionSort(int[] numbers, int numberElements) {
        System.out.println("==== Algorithm Insertion Sort Ordination ====");
        long startAt = System.currentTimeMillis();

        for (int actual = 1; actual < numberElements; actual++) {
            int analyse = actual;

            while (analyse > 0 && numbers[analyse] < numbers[analyse - 1]) {
                Introduction.swap(numbers, analyse, analyse - 1);
                analyse--;
            }
        }

        System.out.println("Duration Insertion Sort: " + Introduction.finishAt(startAt) + " ms");
        //System.out.println("Números ordenados: " + Arrays.toString(numbers));
        System.out.println("==================================================================================");
        System.out.println();
    }
}