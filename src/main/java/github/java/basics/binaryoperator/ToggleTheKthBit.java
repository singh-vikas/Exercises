package github.java.basics.binaryoperator;

public class ToggleTheKthBit {

  public static void main(String[] args) {

    int n = 16;
    //int n = 20;

    int k = 3;

    System.out.println(Integer.toBinaryString(n));

    System.out.println(Integer.toBinaryString(n ^ (1 << k - 1)));
  }
}
