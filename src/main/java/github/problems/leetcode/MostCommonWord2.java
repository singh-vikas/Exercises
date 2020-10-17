package github.problems.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostCommonWord2 {
  public String mostCommonWord(String paragraph, String[] banned) {

    Map<String, Integer> map = new HashMap<>();

    StringBuilder str = new StringBuilder();

    for (int i = 0; i < paragraph.length(); i++) {
      if (Character.isLetter(paragraph.charAt(i))) {
        str.append(paragraph.charAt(i));
      } else if (str.length() > 0) {
        String s = str.toString();

        if (!Arrays.asList(banned).contains(s)) {
          map.put(s, map.getOrDefault(s, 1) + 1);
        }
        str = new StringBuilder();
      }
    }

    int temp = 0;

    String output = "";

    for (Map.Entry<String, Integer> entry : map.entrySet()) {

      if (temp < entry.getValue()) {
        output = entry.getKey();
        temp = entry.getValue();
      }
    }

    return output;
  }

  public static void main(String args[]) {

    System.out.println(new MostCommonWord2()
      .mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"}));
  }
}
