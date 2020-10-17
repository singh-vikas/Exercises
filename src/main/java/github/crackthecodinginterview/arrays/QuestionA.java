package github.crackthecodinginterview.arrays;

public class QuestionA {

  public static boolean isUniqueChars(String str) {
    if (str.length() > 128) {
      return false;
    }
    boolean[] char_set = new boolean[128];
    for (int i = 0; i < str.length(); i++) {
      char c= str.charAt(i);  //Brings char c
      int val = c;            // Converts to ASCII value int
      if (char_set[val]) return false;
      char_set[val] = true;
    }
    return true;
  }

  public static void main(String[] args) {
    String[] words = {"abcde", "hello", "apple", "kite", "padle"};
    for (String word : words) {
      System.out.println(word + ": " + isUniqueChars(word));
    }
  }

}
