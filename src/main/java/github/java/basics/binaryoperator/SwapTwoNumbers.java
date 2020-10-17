package github.java.basics.binaryoperator;

public class SwapTwoNumbers {

  public static void main(String[] args) {

    int x = 20, y = 50;

    System.out.println("Before swap x: " + x + " y:" + y);

    x = x ^ y;
    y = x ^ y;
    x = x ^ y;

    System.out.println("After swap x: " + x + " y:" + y);

  }
}
