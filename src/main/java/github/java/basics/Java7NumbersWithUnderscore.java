package github.java.basics;

public class Java7NumbersWithUnderscore {

  // Java program to demonstrate that we can use underscore
  // in numeric literals

  public static void main(String[] args)
    throws java.lang.Exception {
    int inum = 1_00_00_000;
    System.out.println("inum:" + inum);

    long lnum = 1_00_00_000;
    System.out.println("lnum:" + lnum);

    float fnum = 2.10_001F;
    System.out.println("fnum:" + fnum);

    double dnum = 2.10_12_001;
    System.out.println("dnum:" + dnum);
  }

}
