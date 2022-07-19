package ordination.selection_sort;

import ordination.introdution.Introduction;

public class SelectionSort {

    // ALGORITMO QUE É REFLETIDO EM ACHAR O MENOR VALOR DO ARRAY E DEPOIS IR TROCANDO-O COM O PRIMEIRO ITEM DAS SUB-LISTAS ADJACENTES
    public static void selectionSort(int[] numbers, int finish) {
        System.out.println("==== Algorithm Selection Sort Ordination ====");
        long startAt = System.currentTimeMillis();

        for (int actual = 0; actual < finish; actual++) {
            int minor = Introduction.searchCheaper(numbers, actual, finish);
            Introduction.swap(numbers, actual, minor);
        }

        System.out.println("Duration Selection Sort: " + Introduction.finishAt(startAt) + " ms");
       // System.out.println("Números ordenados: " + Arrays.toString(numbers));
        System.out.println("==================================================================================");
        System.out.println();
    }
}