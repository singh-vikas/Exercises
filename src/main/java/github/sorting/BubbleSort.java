package github.demo.sorting;

import java.util.Random;

/**
 * Bubble sort
 * - Loop over array and compare adjacent elements and swap them.
 *
 * Bubble Sort
 * Worst, Average case performance is O(n Squared)
 * Best case is also O(n)
 * Bubble sort is 70% faster than Selection sort.
 *
 */
public class BubbleSort {

  public static void main(String args[]) {

    //Declare an array.
    int[] intArray = new int[100000];

    Random random = new Random();


    for (int i = 0; i < intArray.length -1; i++) {
      intArray[i] = random.nextInt(1000);
    }

    long before = System.currentTimeMillis();
    //call bubbleSort
    bubbleSort(intArray);
    long after = System.currentTimeMillis();
    long duration = after - before;

    System.out.println("Duration :" + duration);

    //Print the sorted elements.
    StringBuffer str = new StringBuffer();
    str.append("[");
    for (int i = 0; i < intArray.length; i++) {
      str.append(intArray[i]).append(",");
    }
    str.append("]");
    System.out.println(str);

  }

  /**
   * Sort the input array using bubble sort algorithm.
   *
   * @param intArray
   */
  public static void bubbleSort(int[] intArray) {

    //Outer Loop over all the elements.
    for (int j = 0; j < intArray.length - 1; j++) {

      boolean isSorted = true; // O(n)

      //Inner loop over all  the elements.
      for (int i = 0; i < intArray.length - 1; i++) {

        if (intArray[i] > intArray[i + 1]) {
          //swap the elements.
          int temp = intArray[i];
          intArray[i] = intArray[i + 1];
          intArray[i + 1] = temp;

          isSorted = false;
        }
      }

      if (isSorted)   //O(n)
        break;
    }
  }
}
