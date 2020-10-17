package github.problems.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class CountAndSay {
  public String countAndSay(int n) {

    String countAndSay = "1";

    int counter = 1;

    if (counter == n)
      return countAndSay;

    while (counter != n) {
      countAndSay = generateCountAndSay(countAndSay);
      counter++;
    }

    return countAndSay;
  }

  public String generateCountAndSay(String s) {

    StringBuilder build = new StringBuilder();

    int count = 0;
    char c = s.charAt(0);

    for (int i = 0; i < s.length(); i++) {

      if (s.charAt(i) == c) {
        count++;
      } else {
        build.append(count).append(c);
      }
    }

    return build.toString();

  }

  public static void main(String args[]) {
    new CountAndSay().countAndSay(5);
  }

}
