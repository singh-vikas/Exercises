package github.problems.leetcode.dataStructures.arrays;

/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].



Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:

Runtime: 1 ms, faster than 62.31% of Java online submissions for Shuffle the Array.
Memory Usage: 43 MB, less than 100.00% of Java online submissions for Shuffle the Array.

 */
public class ShuffleTheArray {

  public static void main(String[] args) {

    int[] intArray = {2, 5, 1, 3, 4, 7};

    int[] output = shuffle(intArray, 3);

    for (int i=0; i < output.length; i++) {
      System.out.println(output[i]);
    }
  }

  public static int[] shuffle(int[] nums, int n) {

    int i = 1;

    int[] x = new int[n];
    int[] y = new int[n];

    for (i = 0; i < n; i++) {
      x[i] = nums[i];
      y[i] = nums[n + i];
    }

    boolean bool = true;

    int j = 0;
    int k = 0;

    for (i = 0; i < nums.length; i++) {

      if (bool) {
        nums[i] = x[j];
        j++;
        bool = false;
      } else {
        nums[i] = y[k];
        k++;
        bool = true;
      }
    }
    return nums;
  }

}
