package github.demo.sorting;

/**
 * Insertion sort
 * - Pick the first element and put them into the sorted array.
 * - First element is always sorted.
 *
 * Insertion Sort
 * Worst, Average case performance is O(n Squared)
 * Best case is also O(n)
 * Insertion sort is 500% faster than Bubble sort.
 *
 */
public class InsertionSort {

  public static void main(String args[]) {

    //Declare an array.
    int[] intArray = {8, 1, 5, 6, 6, 5, 6, 23};

    //call insertionSort
    insertionSort(intArray);

    //Print the sorted elements.
    for (int i = 0; i < intArray.length; i++) {
      System.out.println(intArray[i]);
    }

  }

  /**
   * Sort the input array using insertion sort algorithm.
   *
   * @param intArray
   */
  public static void insertionSort(int[] intArray) {

    for (int i =1 ; i < intArray.length -1 ; i++){ // n-1 times

      int value= intArray[i];
      int pointer= i;

      while ( pointer > 0 && value < intArray[pointer-1]){   //n-1 times , For sorted array wouldn't run 0
        intArray[pointer] = intArray[pointer-1];
        pointer--;
      }

      intArray[pointer]= value;
    }
  }
}
