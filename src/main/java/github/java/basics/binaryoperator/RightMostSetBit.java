package github.java.basics.binaryoperator;

public class RightMostSetBit {

    // returns position of the rightmost set bit of n
    public static int rightmostSetBitPos(int n) {
      // if number is odd, return 1
      if ((n & 1) == 1) {
        return 1;
      }

      // unset rightmost bit and xor with number itself
      n = n ^ (n & (n - 1));

      // System.out.println(Integer.toBinaryString(n));

      // find the position of the only set bit in the result
      // we can directly return log2(n) + 1 from the function
      int pos = 0;
      while (n != 0) {
        n = n >> 1;
        pos++;
      }

      return pos;
    }

    public static void main (String[] args)
    {
      int n = 20;

      System.out.println(n + " in binary is " + Integer.toBinaryString(n));
      System.out.println("Position of the rightmost set bit is " +
        rightmostSetBitPos(n));
    }
  }
