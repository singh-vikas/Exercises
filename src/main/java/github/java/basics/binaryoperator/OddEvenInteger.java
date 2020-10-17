package github.java.basics.binaryoperator;

public class OddEvenInteger {

  public static  void main (String args[]){
     int n = 21;

    if(( n & 1) == 1){
      System.out.print("Integer is ODD.");
    } else {
      System.out.print("Integer is EVEN.");
    }
  }

}
