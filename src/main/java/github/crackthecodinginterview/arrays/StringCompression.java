package github.crackthecodinginterview.arrays;

public class StringCompression {

  static String compress(String str) {

    StringBuilder stringBuilder = new StringBuilder();
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      count++;
      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        stringBuilder.append(str.charAt(i));
        stringBuilder.append(count);
        count = 0;
      }
    }

    return stringBuilder.toString().length() < str.length() ? stringBuilder.toString() : str;
  }

  public static void main(String[] args) {
    String str = "aabbbcccddddddddd";
    System.out.println(str);
    System.out.println(compress(str));
  }
}
