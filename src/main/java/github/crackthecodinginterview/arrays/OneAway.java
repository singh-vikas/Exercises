package github.crackthecodinginterview.arrays;

public class OneAway {

  static boolean oneEditAway(String s1, String s2) {

    //Input validation
    if (s1.length() == s2.length())
      return oneReplacementAway(s1, s2);
    else if (s1.length() > s2.length())
      return oneInsertAway(s1, s2); //s1 is longer than s2
    else if (s2.length() > s1.length())
      return oneInsertAway(s2, s1);

    return false;
  }

  //Only one difference should be there.
  static boolean oneReplacementAway(String s1, String s2) {

    int i = 0;
    int count = 0;

    while (i < s1.length()) {
      if (count <= 1) {
        if (s1.charAt(i) != s2.charAt(i)) {
          count++;
        }
        i++;
      } else {
        return false;
      }
    }

    return count <= 1;
  }

  //Only one character could be different in longer string.
  static boolean oneInsertAway(String s1, String s2) {

    int index1 = 0;
    int index2 = 0;
    int count = 0;

    while (index1 < s1.length() && index2 < s2.length()) {
      if (count <= 1) {
        if (s1.charAt(index1) == s2.charAt(index2)) {
          index2++;
        } else {
          count++;
        }
        index1++;
      } else {
        return false;
      }
    }
    return count <= 1;
  }

  public static void main(String[] args) {
    String a = "pale";
    String b = "ale";
    boolean isOneEdit = oneEditAway(a, b);
    System.out.println(a + ", " + b + ": " + isOneEdit);
  }
}
