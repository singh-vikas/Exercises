package github.java.basics.binaryoperator;

public class PowerOf2 {

  public static void main(String args[]) {
    int n = 16;

    System.out.println(Integer.toBinaryString(n));

    /**
     * if n is power of 2 then only one bit will be set
     * 32 16 8 4 2 1
     */
    if ((n & n-1) != 0)
      System.out.println(n + " is NOT power of 2");
    else
      System.out.println(n + " is power of 2");

  }

}
