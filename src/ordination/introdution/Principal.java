package ordination.introdution;

import ordination.bubble_sort.BubbleSort;
import ordination.insert_sort.InsertSort;
import ordination.merge_sort.MergeSort;
import ordination.quick_sort.QuickSort;
import ordination.selection_sort.SelectionSort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Principal {
    private static int[] generateArrayOfNumbers(int min, int max, int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(min, max);
        }

        return numbers;
    }

    public static void main(String[] args) {
        System.out.println("==================================================================================");
        System.out.println("==== Algoritmos de ordenação | Selection | Insert | Bubble | Merge | Quick ====");
        System.out.println("==================================================================================");

        int min = 1;
        int max = 100;
        int size = 75;

        var numbers = generateArrayOfNumbers(min, max, size);

        System.out.println("Números aleatórios: " + Arrays.toString(numbers));
        System.out.println("==================================================================================");
        System.out.println("==================================================================================");
        System.out.println();

        SelectionSort.selectionSort(numbers, numbers.length); //O(n^2)
        BubbleSort.bubbleSort(numbers, numbers.length); //O(n^2)
        InsertSort.insertionSort(numbers, numbers.length); //O(n^2)
        MergeSort.startMergeSort(numbers, new int[numbers.length], 0, numbers.length - 1); //O(nLog(n))
        QuickSort.startQuickSort(numbers, 0, numbers.length - 1);
    }
}