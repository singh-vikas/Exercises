package github.educative.patterns.cyclicsort;

import java.util.Arrays;

public class CyclicSort {
  public static int[] sort(int[] nums) {
    //5 4 3 1 2
    int i=0;

    while (i < nums.length) {
      if (nums[i] != i + 1) {
        int index = nums[i] - 1;
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
      } else {
        i++;
      }
    }

    return nums;
  }

  public static void main(String[] args) {

    int[] array=new int[]{4,5,2,3,1};

    array= sort(array);

    Arrays.stream(array).forEach( i -> System.out.println(i) );
  }
}

