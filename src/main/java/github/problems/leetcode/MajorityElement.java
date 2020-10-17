package github.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int max = 0;
        map.put(0, 0);

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);
        }

        for (Map.Entry entry : map.entrySet()) {

            if ((int) entry.getValue() > nums.length / 2
                    && (int) entry.getValue() > map.get(max)) {
                max = (int) entry.getValue();
            }
        }

        return max;
    }

    public static void main(String args[]) {
        new MajorityElement().majorityElement(new int[]{-1, 1, 1, 1, 2, 1});
    }
}
