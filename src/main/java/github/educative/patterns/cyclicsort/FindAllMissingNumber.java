package github.educative.patterns.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumber {

  public static List<Integer> finaAllMissingNumber(int[] nums) {

    List<Integer> list = new ArrayList<>();

    for (int i = 1; i <= nums.length; i++) {
      list.add(i);
    }

    int i = 0;
    while (i < nums.length) {
      list.remove(Integer.valueOf(nums[i]));
      i++;
    }

    return list;
  }

  public static void main(String args[]) {
    System.out.print(finaAllMissingNumber(new int[] {4, 0, 3, 1}));
  }
}
