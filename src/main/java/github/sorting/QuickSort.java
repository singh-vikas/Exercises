package github.sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String args[]) {

        int[] array = new int[100];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }

        quickSort(array, 0, array.length - 1);

        Arrays.stream(array).forEach(System.out::println);
    }

    public static void quickSort(int[] array, int start, int end) {

        if (start < end) {
            int pIndex = partition(array, start, end);
            quickSort(array, start, pIndex - 1);
            quickSort(array, pIndex + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];

        int partitonIndex = start;

        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                swap(array, partitonIndex, i);
                partitonIndex++;
            }
        }

        swap(array, partitonIndex, end);

        return partitonIndex;
    }

    private static void swap(int[] array, int partitonIndex, int i) {
        int temp = array[partitonIndex];
        array[partitonIndex] = array[i];
        array[i] = temp;
    }

    //  8 3 2 1 5 6 7 4


}
