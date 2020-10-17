package github.java.basics;

//https://www.geeksforgeeks.org/type-conversion-java-examples/
// byte > short > int > long > float > double

//Widening conversion takes place when two data types are automatically converted. This happens when:
//
//  The two data types are compatible.
//  When we assign value of a smaller data type to a bigger data type.

class WideConversion {

  public static void main(String[] args) {
    int i = 100;

    // automatic type conversion
    long l = i;

    // automatic type conversion
    float f = l;
    System.out.println("Int value " + i);
    System.out.println("Long value " + l);
    System.out.println("Float value " + f);
  }

}
//Narrowing or Explicit Conversion
// Double > float > long > int > short > byte.
//  If we want to assign a value of larger data type to a smaller data type we perform explicit type casting or narrowing.
//
//  This is useful for incompatible data types where automatic conversion cannot be done.
//    Here, target-type specifies the desired type to convert the specified value to.

//Java program to illustrate explicit type conversion
class NarrowConversion {
  public static void main(String[] args) {
    double d = 100.04;

    //explicit type casting
    long l = (long) d;

    //explicit type casting
    int i = (int) l;
    System.out.println("Double value " + d);

    //fractional part lost
    System.out.println("Long value " + l);

    //fractional part lost
    System.out.println("Int value " + i);

    //While assigning value to byte type the fractional part is lost and is reduced to modulo 256(range of byte).
  }
}

class TypePromotion {

  //    While evaluating expressions, the intermediate value may exceed the range of operands and hence the expression value will be promoted. Some conditions for type promotion are:
  //
  //    Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
  //    If one operand is a long, float or double the whole expression is promoted to long, float or double respectively.

  public static void main(String args[]) {
    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = .1234;

    // The Expression
    double result = (f * b) + (i / c) - (d * s);

    //Result after all the promotions are done
    System.out.println("result = " + result);
  }
}

class ExplicitTypeConversion {

  //  Explicit type casting in Expressions
  //  While evaluating expressions, the result is automatically updated to larger data type  of the operand. But if we store that result in any smaller data type it generates compile time error, due to which we need to type cast the result.
  public static void main(String args[])
  {
    byte b = 50;

    //type casting ""int"" to byte
    b = (byte)(b * 2);
    System.out.println(b);
  }
}

