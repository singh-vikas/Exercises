package github.crackthecodinginterview.arrays;

import java.util.Arrays;

/**
 * Permutation means String is subString of another string.
 *
 * case sensitive .
 * Whitespaces will count.
 * ex. "God    " and dog
 */
public class PermutationStrings {

  //via sorting.
  char[] sortTheStrings(String str) {
    char[] sortedTest = str.toCharArray();
    Arrays.sort(sortedTest);
    return sortedTest;
  }

  private boolean isPermutation(String test, String str) {
    char[] sortedTest = sortTheStrings(test);
    char[] sortedStr = sortTheStrings(str);

    int nextIndex = 0;
    int count = 0;

    for (int i = 0; i < sortedTest.length; i++) {
      for (int j = nextIndex; j < sortedStr.length; j++) {
        if (sortedTest[i] == sortedStr[j]) {
          count++;
          if (count == sortedTest.length) { //sorted string length should match with the count.
            return true;
          }
          break;
        } else if (nextIndex > 0){
          return false;
        }
      }
    }


    return false;
  }

  public static void main(String[] args) {

    PermutationStrings p = new PermutationStrings();
    boolean isPermutation = p.isPermutation("ab", "eidbaaooo");
    System.out.println(isPermutation);

  }
}
