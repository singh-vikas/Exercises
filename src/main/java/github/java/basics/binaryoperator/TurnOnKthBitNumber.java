package github.java.basics.binaryoperator;

public class TurnOnKthBitNumber {
  public static void main(String[] args) {
    int n = 16; //Number
    int k = 3; // Bit to turn off.

    System.out.println(Integer.toBinaryString(n));
    System.out.println(Integer.toBinaryString( n | (1 << k-1)));
  }
}
