package github.crackthecodinginterview.arrays;

public class URLify {

  static String replaceSpaces(char[] charArray, int trueLength) {

    StringBuilder output = new StringBuilder();

    for (int i = 0; i < trueLength; i++) {
      if (charArray[i] == ' ') {
        output.append("%20");
      } else {
        output.append(charArray[i]);
      }
    }

    return output.toString();
  }

  public static void main(String[] args) {

    String s = "Mr John Smith   ";
    int trueLength = 13;

    System.out.println(replaceSpaces(s.toCharArray(), trueLength));

  }
}
