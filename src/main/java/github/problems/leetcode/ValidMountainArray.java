package github.problems.leetcode;

public class ValidMountainArray {
  public static boolean validMountainArray(int[] A) {

    int len = A.length;

    if (len < 3)
      return false;

    int startIndex = 0;
    int endIndex = len - 1;

    while (startIndex < endIndex) {

      if (A[startIndex] < A[startIndex + 1]) {
        startIndex++;
      } else if (A[endIndex] < A[endIndex - 1]) {
        endIndex--;
      } else {
        return false;
      }
    }

    return startIndex == endIndex && endIndex != len - 1 && startIndex != 0;
  }

  public static void main(String[] args) {
    System.out.println(validMountainArray(new int[] {3, 5, 5,}));
  }
}
