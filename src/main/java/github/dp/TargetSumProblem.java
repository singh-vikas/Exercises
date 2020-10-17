package github.dp;

public class TargetSumProblem {

  public static void main(String[] args) {

    int[] array = {2, 3, 7, 8, 10};
    System.out.println(solveTargetSum(array, 50));
  }

  private static boolean solveTargetSum(int[] array, int targetSum) {
    int index = 0;
    return recursionTargetSum(array, index, targetSum);
  }

  private static boolean recursionTargetSum(int[] array, int index, int targetSum) {

    if (targetSum == 0)
      return true;

    if (index == array.length)
      return false;

    int sum1 = targetSum - array[index];
    int sum2 = targetSum;

    index++;

    return recursionTargetSum(array, index, sum1) || recursionTargetSum(array, index, sum2);

  }

}
