package github.educative.patterns.cyclicsort;

public class FindTheMissingNumber {

  // Find the missing number in the array.
  public static int findMissingNumber(int[] nums) {

    // 4 0 1 3
    for (int i = 0; i < nums.length; ) {
      if (nums[i] < nums.length && i != nums[i]) {
        swap(nums, i, nums[i]);
      } else {
        i++;
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (i != nums[i])
        return i;
    }

    return nums.length;
  }

  public static void swap(int[] nums, int currentIndex, int number) {

    int temp = nums[currentIndex];
    nums[currentIndex] = nums[number];

    nums[number] = temp;

  }

  public static void main(String args[]) {
    System.out.print(findMissingNumber(new int[] {4, 0, 3, 1}));
  }

}
