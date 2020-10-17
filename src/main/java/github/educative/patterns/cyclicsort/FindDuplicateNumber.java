package github.educative.patterns.cyclicsort;

public class FindDuplicateNumber {

  public static int findDuplicateNumber(int[] nums) {

    int i = 0;
    while (i < nums.length) {
      if (i + 1 != nums[i]) {
        if(i != nums[i-1]) {
          swap(nums, i, nums[i]);
        } else {
         return nums[i];
        }
      } else {
        i++;
      }
    }
    return nums.length;
  }

  public static void swap(int[] nums, int currentIndex, int number) {   // 0, 2
    int temp = nums[number -1 ]; //0--> 2
     nums[number -1] = nums[currentIndex];
     nums[currentIndex] = temp;
  }

  public static void main(String args[]) {
    System.out.print(findDuplicateNumber(new int[] {2, 2, 3, 1}));
  }
}
