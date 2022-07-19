package ordination.bubble_sort;

import ordination.introdution.Introduction;

import java.util.Arrays;

public class BubbleSort {

    // ALGORITMO QUE É REFLETIDO EM COMPARAR PARES CONSECUTIVOS DENTRO DO ARRAY
    public static void bubbleSort(int[] numbers, int finish) {
        System.out.println("==== Algorithm Bubble Sort Ordination ====");
        long startAt = System.currentTimeMillis();
        for (int i = 0; i < finish - 1; i++) {
            for (int j = 0; j < finish - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    Introduction.swap(numbers, j, j + 1);
                }
            }
        }

        System.out.println("Duration Bubble Sort: " + Introduction.finishAt(startAt) + " ms");
        //System.out.println("Números ordenados: " + Arrays.toString(numbers));
        System.out.println("==================================================================================");
        System.out.println();
    }
}