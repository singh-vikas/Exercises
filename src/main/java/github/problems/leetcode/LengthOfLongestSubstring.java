package github.problems.leetcode;
// Java program to find the length of the longest substring
// without repeating characters

import java.util.*;

public class LengthOfLongestSubstring {

  public static void main(String[] args) {

    //String s = "abcabcbb";
    //String s="bbbbb";
    String s="pwwwk";

    System.out.println(lengthOfLongestSubstring(s));
  }

  public static int lengthOfLongestSubstring(String s) {

    HashSet<Character> charHashSet = new HashSet<Character>();

    int pointerA = 0;
    int pointerB = 0;
    int res = 0;

    while (pointerB < s.length()) {

      char input = s.charAt(pointerB);

      if (!charHashSet.contains(input)) {
        charHashSet.add(input);
        pointerB++;
        res = Math.max(charHashSet.size(), res);
      } else {
        char input2 = s.charAt(pointerA);
        charHashSet.remove(input2);
        pointerA++;
      }
    }

    return res;
  }
}
