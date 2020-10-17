package github.demo.sorting;

/**
 *
 * MergeSort
 * - Divide and conquer
 * - Stable
 * - Recursive
 * - Not in place O(n) Space Complexity
 * - Time complexity O(n).
 *
 */
public class MergeSort {

  public static void main(String args[]) {

    int[] intArray = {5, 2, 3, 4, 9, 0, 5};

    mergeSort(intArray);

    for (int i = 0; i < intArray.length; i++) {
      System.out.println(intArray[i]);
    }
  }

  public static void mergeSort(int[] intArray) {

    int length = intArray.length;

    if (length < 2) {
      return;
    }

    int mid = length / 2;   //Mid point of array.

    int[] left = new int[mid];      //Left Array
    int[] right = new int[length - mid];  //Right array

    for (int i = 0; i < mid; i++) {   // Till mid point
      left[i] = intArray[i];
    }

    for (int i = mid; i < length; i++) {   //Mid point
      right[i - mid] = intArray[i];
    }

    mergeSort(left);
    mergeSort(right);
    mergeArrays(left, right, intArray);

  }

  /**
   * Merge sort implementation.
   *
   * @param left
   * @param right
   * @param intArray
   */
  public static void mergeArrays(int[] left, int[] right, int[] intArray) {

    int leftLength = left.length;
    int rightLength = right.length;

    int i = 0;
    int j = 0;
    int k = 0;

    while (i < leftLength && j < rightLength) {

      if (left[i] <= right[j]) {
        intArray[k] = left[i];
        i++;
      } else {
        intArray[k] = right[j];
        j++;
      }
      k++;
    }

    while (i < leftLength) {
      intArray[k] = left[i];
      i++;
      k++;
    }

    while (j < rightLength) {
      intArray[k] = right[j];
      j++;
      k++;
    }
  }

}
