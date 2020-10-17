package github.crackthecodinginterview.arrays;

import java.util.HashSet;

/**
 * Anagrams
 * - Same Length
 * - Same character at different places
 *
 * Input: arr[] =  {"geeksquiz", "geeksforgeeks", "abcd",
 *                  "forgeeksgeeks", "zuiqkeegs"};
 * Output: (geeksforgeeks, forgeeksgeeks), (geeksquiz, zuiqkeegs)
 *
 */
public class AnagramsExample2 {

  public static String processTheArray(String arr[]) {

    return "";
  }

  public static boolean isAnagrams(String[] s) {

    int[] array = new int[128];

    for (int i = 0; i < s[0].length(); i++) {
      int index = s[0].charAt(i);
      array[index]++;

      int index2 = s[1].charAt(i);
      array[index2]--;
    }
    return isZeroArray(array);
  }

  private static boolean isZeroArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 0)
        continue;
      return false;
    }
    return true;
  }

  public static void main(String[] args) {

    String arr[] = {"geeksquiz", "geeksforgeeks", "abcd", "forgeeksgeeks", "zuiqkeegs"};

    System.out.println(processTheArray(arr));
  }

}
