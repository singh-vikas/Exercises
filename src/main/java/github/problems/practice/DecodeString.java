package github.problems.practice;

import java.util.Stack;

/**
 * Input : str[] = "1[b]"
 * Output : b
 * Input : str[] = "2[ab]"
 * Output : abab
 * Input : str[] = "2[a2[b]]"
 * Output : abbabb
 * Input : str[] = "3[b2[ca]]"
 * Output : bcacabcacabcaca
 *
 */
public class DecodeString {

  public static String decodeString(String[] input) {

    String output = new String();

    Stack<String> stack = new Stack<>();

    for (int i = 0; i < input.length; i++) {
      stack.push(input[i]);
    }

    String temp = stack.pop();
    while (!stack.isEmpty()) {

      if (temp.equals("]")) {
        temp = stack.pop();
      } else if (temp.equals("[")) {

        int i = Integer.parseInt(stack.pop());

        for (; i > 1; i--) {
          output = output + output;
        }
        if (!stack.isEmpty()) {
          temp = stack.pop();
        }
      } else {
        output = temp + output;
        temp = stack.pop();
      }
    }

    return output;
  }

  public static void main(String[] args) {

    String[] str1 = {"1", "[", "b", "]"};
    String[] str2 = {"2", "[", "a", "b", "]"};
    String[] str3 = {"2", "[", "a", "2", "[", "b", "]", "]"};
    String[] str4 = {"3", "[", "b", "2", "[", "c", "a", "]", "]"};

    System.out.println(decodeString(str1));
    System.out.println(decodeString(str2));
    System.out.println(decodeString(str3));
    System.out.println(decodeString(str4));

  }

}
