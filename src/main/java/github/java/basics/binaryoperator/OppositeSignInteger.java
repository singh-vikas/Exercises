package github.java.basics.binaryoperator;

public class OppositeSignInteger {

  public static void main(String args[]) {
    int n1 = 21;
    int n2 = 15;

    if ((n1 ^ n2) > 0) {
      System.out.print("Integer is of same sign.");
    } else {
      System.out.print("Integer is of opposite sign.");
    }
  }
}
