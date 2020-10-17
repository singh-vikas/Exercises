package github.problems.leetcode;

import java.util.Arrays;

public class LargestNumber {

    public int largestNumber(int[] nums) {

        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(asStrs);
        Arrays.stream(asStrs).forEach(System.out::println);

        return 0;
    }


    public static void main(String args[]) {
        new LargestNumber().largestNumber(new int[]{3, 30, 34, 5, 9});
    }
}
