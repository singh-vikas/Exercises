package github.java.basics.binaryoperator;

public class IsKthBitSet {
  public static void main(String[] args) {
    int n = 20; //Number
    int k = 3; // is 3rd bit set ?.

    System.out.println(Integer.toBinaryString(n));

    /**
     * Get the number which has kth bit set and check if it is non Zero.
     */
    if ((n & (1 << k - 1)) != 0) {
      System.out.println("Yes it is set.");
    } else {
      System.out.println("Not set.");
    }
  }
}
