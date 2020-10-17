package github.java.basics;

public class StringExample {

  public static void main(String[] args) {

    String x = new String("str");
    String y = new String("str");

    System.out.println(x == y); // prints false
    System.out.println(x.equals(y)); // prints true



    String str1 = "String1";
    String str2 = "String1"; // It doesn't create a new String and rather reuses the string literal from pool

    System.out.println(str1 == str2); // prints false
    System.out.println(str1.equals(str2)); // prints true


    // Why Char array is preferred over String for storing password?
    // Ans. String is immutable in java and stored in String pool.
    // Once it's created it stays in the pool until unless garbage collected,
    // so even though we are done with password it's available in memory for longer
    // duration and there is no way to avoid it. It's a security risk because anyone
    // having access to memory dump can find the password as clear text.

    }
}
