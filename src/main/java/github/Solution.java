package github;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int singleNumber(int[] nums) {

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < nums.length ; i++) {

      if (!list.contains(nums[i])) {
        list.add(nums[i]);
      } else {
        list.remove(new Integer(nums[i]));
      }
    }

    return list.get(0);
  }

  public static void main(String[] args) {

    main(null);

   // new Solution().singleNumber(new int[] {2, 2, 1});

    System.out.println(new DecimalFormat("###").format(new BigDecimal(23.00)));


    BigDecimal bg=new BigDecimal("300.00");

    System.out.println(bg.setScale(0, RoundingMode.DOWN));
  }
}
