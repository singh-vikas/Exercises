package github.java.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class SortingInJava {

  //Arrays.Sort() works for arrays which can be of primitive data type also.
  // A sample Java program to demonstrate working of
  // Arrays.sort().
  // It by default sorts in ascending order.

  public static void main(String[] args) {
    int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};

    Arrays.sort(arr);
    System.out.println("Modified arr[] : " +
      Arrays.toString(arr));

    // Sort subarray from index 1 to 4, i.e.,
    // only sort subarray {7, 6, 45, 21} and
    // keep other elements as it is.
    Arrays.sort(arr, 1, 5);
    System.out.println("Modified arr[] : " +
      Arrays.toString(arr));

    // A sample Java program to sort an array
    // in descending order using Arrays.sort().
    // Sorts arr[] in descending order
    // Note that we have Integer here instead of
    // int[] as Collections.reverseOrder doesn't
    // work for primitive types.
    Integer[] arrayofIntegerObject = {13, 7, 6, 45, 21, 9, 2, 100};
    Arrays.sort(arrayofIntegerObject, Collections.reverseOrder());

    System.out.println("Modified arr[] : " +
      Arrays.toString(arrayofIntegerObject));
  }
}

//Collections.sort() works for objects Collections like ArrayList and LinkedList.

// Java program to demonstrate working of Collections.sort()

class CollectionSorting {
  public static void main(String[] args) {
    // Create a list of strings
    ArrayList<String> al = new ArrayList<String>();
    al.add("Geeks For Geeks");
    al.add("Friends");
    al.add("Dear");
    al.add("Is");
    al.add("Superb");

		/* Collections.sort method is sorting the
		elements of ArrayList in ascending order. */
    Collections.sort(al);

    // Let us print the sorted list
    System.out.println("List after the use of"
      + " Collection.sort() :\n" + al);

    /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
    Collections.sort(al, Collections.reverseOrder());
    // Let us print the sorted list
    System.out.println("List after the use of"
      + " Collection.sort() :\n" + al);

  }
}
