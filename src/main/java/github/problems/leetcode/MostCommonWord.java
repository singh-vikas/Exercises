package github.problems.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonWord {

  public static String mostCommonWord(String paragraph, String[] banned) {

    paragraph = paragraph.toLowerCase();

    Map<String, Integer> hashMap = new HashMap<>();

    List<String> bannedList = Arrays.asList(banned);

    String ans = "";
    int ansCount = 0;

    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < paragraph.length(); i++) {
      if (Character.isLetter(paragraph.charAt(i))) {
        builder.append(paragraph.charAt(i));
      } else if (builder.length() > 0) {
        String word = builder.toString();
        if (!bannedList.contains(word)) {
          hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
          if (hashMap.get(word) > ansCount) {
            ans = word;
            ansCount = (int) hashMap.get(word);
          }
        }
        builder = new StringBuilder();
      }
    }

    return ans;
  }

  public static boolean isLowerCaseValidChar(char c) {
    int min = 'a';
    int max = 'z';

    if (min <= 'c' && 'c' <= max) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
    String[] arrays = {"hit"};
    System.out.println(mostCommonWord(paragraph, arrays));
  }
}
