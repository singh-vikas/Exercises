package github.crackthecodinginterview.arrays;

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
public class AnagramsExample {

  public static String processTheArray(String arr[]) {

    StringBuilder output = new StringBuilder();

    int j=1;
    for (int i = 0; i < arr.length; i++) {
        if (j < arr.length && arr[i].length() == arr[j].length()) {
          if(isAnagrams(arr[i], arr[j])){
            output.append("[").append(arr[i]).append(",").append(arr[j]).append("]");
          }
          j++;
        }
    }

      return output.toString();
  }

  public static boolean isAnagrams(String s1, String s2) {

    int[] array = new int[128];

    for (int i = 0; i < s1.length(); i++) {
      int index = s1.charAt(i);
      array[index]++;

      int index2 = s2.charAt(i);
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
