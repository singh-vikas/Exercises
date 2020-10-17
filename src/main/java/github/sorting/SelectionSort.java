package github.demo.sorting;

/**
 * Selection sort
 * - Pick the smallest element and it's index out of an array.
 * - Put the smallest element at forefront
 * - Swap the element
 *
 * Selection Sort
 * Worst, Average case performance is O(n Squared)
 * Best case is also O(n Squared)
 * Never use Selection Sort
 */
public class SelectionSort {

  public static void main(String args[]) {

    //Declare an array.
    int[] intArray = {3, 1, 5, 2, 6, 6, 5, 6, 23};

    //call selectionSort
    selectionSort(intArray);

    //Print the sorted elements.
    for (int i = 0; i < intArray.length; i++) {
      System.out.println(intArray[i]);
    }

  }

  /**
   * Sort the input array using selection sort algorithm.
   *
   * @param intArray
   */
  public static void selectionSort(int[] intArray) {

    int length = intArray.length;

    //Outer-loop to loop over all the elements.
    for (int i = 0; i < length - 1; i++) {

      int minIndex = i;

      //Inner loop to compare the element and find the smallest element.
      for (int j = i + 1; j < length - 1; j++) {
        if (intArray[j] < intArray[minIndex]) {
          minIndex = j;
        }
      }

      int temp = intArray[i];
      intArray[i] = intArray[minIndex];
      intArray[minIndex] = temp;

    }
  }
}




