package github;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestDemo {

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<String>();
    list.add("LOW");
    list.add("MEDIUM");
    list.containsAll(list);

    String[] strings = new String[5];
    strings[0] = "LOW";
    strings[1] = "MEDIUM";

    if (list.contains(Level.LOW.name())) {
      // System.out.println("hello");
    }



   // BigDecimal aos = new BigDecimal(55);
    BigDecimal pos = new BigDecimal(60);
    //System.out.println(aos.subtract(pos));

    // System.out.print(checkInclusion("ab", "eidaoooab"));

    //System.out.print(longestOnes(new int[] {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));

    //System.out.print(totalFruit(new int[] {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}));

    String s= "new";

    BigDecimal aos = new BigDecimal(55);

    aos= aos.negate();

    System.out.println(aos);
  }

  enum Level {
    LOW,
    MEDIUM,
    HIGH;

    public String value() {
      return this.name();
    }

  }

  public static boolean checkInclusion(String s1, String s2) {
    s1 = sort(s1);
    for (int i = 0; i <= s2.length() - s1.length(); i++) {
      String s = s2.substring(i, i + s1.length());
      if (s1.equals(sort(s)))
        return true;
    }
    return false;
  }

  public static String sort(String s) {
    char[] t = s.toCharArray();
    Arrays.sort(t);
    return new String(t);
  }

  public int longestOnes(int[] A, int K) {

    int[] count = new int[2];
    int start = 0, end = 0;
    int maxCount = 0;

    while (end < A.length) {
      count[A[end]]++;
      if (count[0] > K) {
        count[A[start]]--;
        start++;
      }
      maxCount = Math.max(maxCount, end - start + 1);
      end++;
    }
    return maxCount;
  }

  public static int totalFruit(int[] tree) {

    int start = 0, end = 0;
    int maxCount = 0;

    Map<Integer, Integer> map = new HashMap<>();

    while (end < tree.length) {

      //Build  a map and tree and their count.
      map.put(tree[end], map.getOrDefault(tree[end], 0) + 1);

      while (map.size() > 2) {
        map.put(tree[end], map.getOrDefault(tree[end], 0) - 1);

        if (map.get(tree[end]) == 0)
          map.remove(tree[start]);

        start++;
      }

      //max count.
      maxCount = Math.max(maxCount, end - start + 1);

      end++;
    }

    return maxCount;
  }

  public int fibonacci(int n){

    if(n == 0) return 0;
    if(n == 1) return 1;

    return fibonacci(n-1) + fibonacci(n-2);
  }
}
