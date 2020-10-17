package github.java.basics;

//The Java program compiles and runs fine.
// Note that Class2 and fun() are not declared before their use.
// Unlike C++, we don’t need forward declarations in Java.
// Identifiers (class and method names) are recognized automatically from source files.
// Similarly, library methods are directly read from the libraries, and there i
// s no need to create header files with declarations. Java uses naming scheme where p
// ackage and public class names must follow directory and file names respectively. This naming scheme allows Java compiler to locate library files.



class Class1 {
  public static void main(String[] args) {
    Class2 t1 = new Class2();
    t1.fun(5);
  }
}

class Class2 {
  void fun(int x) {
    System.out.println("fun() called: x = " + x);
  }
}


