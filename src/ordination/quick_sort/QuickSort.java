package ordination.quick_sort;

import ordination.introdution.Introduction;

import java.util.Arrays;

public class QuickSort {
    public static void startQuickSort(int[] numbers, int init, int finish) {
        System.out.println("==== Algorithm Quick Sort Ordination ====");
        long startAt = System.currentTimeMillis();

        quickSort(numbers, init, finish);

        System.out.println("Duration Quick Sort: " + Introduction.finishAt(startAt) + " ms");
        System.out.println("Números ordenados: " + Arrays.toString(numbers));
        System.out.println("==================================================================================");
        System.out.println();
    }

    private static void quickSort(int[] list, int init, int finish) {
        if (init < finish) {
            int p = partition(list, init, finish);
            quickSort(list, init, p - 1);
            quickSort(list, p + 1, finish);
        }
    }

    private static int partition(int[] v, int init, int finish) {
        int pivot = v[finish];
        int i = init;
        int j = finish - 1;

        while (i <= j) {
            if (v[i] <= pivot) i++;
            else if (v[j] > pivot) j--;
            else {
                Introduction.swap(v, i, j);
                i++;
                j--;
            }
        }
        Introduction.swap(v, i, finish);
        return i;
    }
}