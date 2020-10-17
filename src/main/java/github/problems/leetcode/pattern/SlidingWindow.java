package github.problems.leetcode.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SlidingWindow {

  //  Input: S = "ADOBECODEBANC", T = "ABC"
  //  Output: "BANC"

  public String minWindow(String s, String t) {

    int[] map = new int[128];

    for (char c : t.toCharArray()) {
      map[c]++;
    }

    int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();

    while (end < s.length()) {
      final char c1 = s.charAt(end);

      if (map[c1] > 0)
        counter--;

      map[c1]--;
      end++;

      while (counter == 0) {
        if (minLen > end - start) {
          minLen = end - start;
          minStart = start;
        }

        final char c2 = s.charAt(start);
        map[c2]++;

        if (map[c2] > 0)
          counter++;

        start++;
      }
    }

    return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
  }

  public String minHshMapWindow(String s, String t) {
    HashMap<Character, Integer> map = new HashMap();
    for (char c : s.toCharArray())
      map.put(c, 0);

    for (char c : t.toCharArray()) {
      if (map.containsKey(c))
        map.put(c, map.get(c) + 1);
      else
        return "";
    }

    int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
    while (end < s.length()) {
      char c1 = s.charAt(end);

      if (map.get(c1) > 0)
        counter--;

      map.put(c1, map.get(c1) - 1);

      end++;

      while (counter == 0) {
        if (minLen > end - start) {
          minLen = end - start;
          minStart = start;
        }

        char c2 = s.charAt(start);
        map.put(c2, map.get(c2) + 1);

        if (map.get(c2) > 0)
          counter++;

        start++;
      }
    }
    return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
  }
}

class Solution {

  public static void main(String[] args) {

    int[] arrays = {1, 2, 3, 2, 2};
   totalFruit(arrays);

  }

  public static int totalFruit(int[] tree) {

    int len = tree.length;


    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    int start = 0, end = 0;
    int maxCount = 0;

    while (end < len) {

      if (!map.containsKey(tree[end])) {
        map.put(tree[end], 1);
      } else {
        map.put(tree[end], map.get(tree[end]) + 1);
      }

      while (map.size() > 2) {
        map.put(tree[start], map.get(tree[start]) - 1);
        if (map.get(tree[start]) == 0)
          map.remove(tree[start]);
        start++;
      }

      maxCount = Math.max(maxCount, end - start + 1);

      end++;
    }
    return maxCount;
  }
}


