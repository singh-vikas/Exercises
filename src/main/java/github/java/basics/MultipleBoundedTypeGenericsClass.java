package github.java.basics;

// Multiple Bounds
//Syntax

//Java Generics supports multiple bounds also, i.e .
// In this case A can be an interface or class.
// If A is class then B and C should be interfaces. We can’t have more than one class in multiple bounds.
//<T extends superClassName & Interface>

class BoundIt<T extends ParentClassA & InterfaceB> {

  private T objRef;

  public BoundIt(T obj) {
    this.objRef = obj;
  }

  public void doRunTest() {
    this.objRef.displayClass();
  }
}

interface InterfaceB {
  public void displayClass();
}

class ParentClassA implements InterfaceB {
  public void displayClass() {
    System.out.println("Inside super class A");
  }
}

class MultipleBoundedTypeGenericsClass {
  public static void main(String a[]) {
    //Creating object of sub class A and
    //passing it to Bound as a type parameter.
    BoundIt<ParentClassA> bea = new BoundIt<ParentClassA>(new ParentClassA());
    bea.doRunTest();

  }
}
