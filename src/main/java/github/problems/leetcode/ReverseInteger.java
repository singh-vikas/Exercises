package github.problems.leetcode;

public class ReverseInteger {

  public static void main(String[] args) {

    int input = 1534236469;
    int output = reverseInt(input);
    System.out.println(output);
  }

  private static int reverseInt(int input) {

    long res = 0;

    while (input != 0) {
      int remainder = input % 10;
      res = res * 10 + remainder;
      input = input / 10;
    }

    if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
      return 0;
    }

    return (int) res;
  }
}
