package github.dp;

public class MinimumSubsetSumDifference {

  private static int min = 0;

  public static void main(String[] args) {
    int[] array = {2, 3, 7, 8, 10};

    int totalSum = 0;
    for (int i = 0; i < array.length; i++) {
      totalSum = totalSum + array[i];
    }

    int s1 = 0;
    min = array[0];

    minimumSubsetSumDifference(array, totalSum, 0, s1);
    System.out.println(min);
  }

  private static void minimumSubsetSumDifference(int[] array, int totalSum, int index, int s1) {

    if (index == array.length/2)
      return;

    min = Math.min(min, 2 * totalSum - s1);

    s1 = s1 + array[index];
    minimumSubsetSumDifference(array, totalSum, index++, s1);
  }

}
