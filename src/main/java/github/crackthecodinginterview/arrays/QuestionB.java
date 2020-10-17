package github.crackthecodinginterview.arrays;

public class QuestionB {

  public static boolean isUniqueChars(String str) {

    char[] array = str.toCharArray();

    int checker = 0;
    for (char c : array) {
      int value= c - 'a';
      if( (checker &(1 << value)) > 0  ) return false;
      checker |= (1 << value);
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
