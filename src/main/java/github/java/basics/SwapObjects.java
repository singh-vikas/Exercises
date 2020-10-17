package github.java.basics;

// A car with number class Car
class Car {
  int no;

  Car(int no) {
    this.no = no;
  }
}

// A class that uses Car objects
class SwapObjects {
  // To swap c1 and c2
  public static void swap(Car c1, Car c2) {
    int temp = c1.no;
    c1.no = c2.no;
    c2.no = temp;
  }

  // Driver method
  public static void main(String[] args) {
    Car c1 = new Car(1);
    Car c2 = new Car(2);
    swap(c1, c2);
    System.out.println("c1.no = " + c1.no);
    System.out.println("c2.no = " + c2.no);
  }
}

//What if we don’t know members of Car?

// A Java program to demonstrate that simply swapping
// object references doesn't work

// A car with number and name
class Car2 {
  int model, no;

  // Constructor
  Car2(int model, int no) {
    this.model = model;
    this.no = no;
  }

  // Utility method to print Car
  void print() {
    System.out.println("no = " + no +
      ", model = " + model);
  }
}

// A class that uses Car
class SwapPassbyValueWouldntWork {
  // swap() doesn't swap c1 and c2
  public static void swap(Car2 c1, Car2 c2) {
    Car2 temp = c1;
    c1 = c2;
    c2 = temp;
  }

  // Driver method
  public static void main(String[] args) {
    Car2 c1 = new Car2(101, 1);
    Car2 c2 = new Car2(202, 2);
    swap(c1, c2);
    c1.print();
    c2.print();
  }
}

//For above solution is  to use Wrapper Class If we create a wrapper class that
// contains references of Car, we can swap cars by swapping references of wrapper class.

// A Java program to demonstrate that we can use wrapper
// classes to swap to objects

// A car with model and no.
class Car3 {
  int model, no;

  // Constructor
  Car3(int model, int no) {
    this.model = model;
    this.no = no;
  }

  // Utility method to print object details
  void print() {
    System.out.println("no = " + no +
      ", model = " + model);
  }
}

// A Wrapper over class that is used for swapping
class CarWrapper {
  Car3 c;

  // Constructor
  CarWrapper(Car3 c) {
    this.c = c;
  }
}

// A Class that use Car and swaps objects of Car
// using CarWrapper
class WrapperDemo {
  // This method swaps car objects in wrappers
  // cw1 and cw2
  public static void swap(CarWrapper cw1,
    CarWrapper cw2) {
    Car3 temp = cw1.c;
    cw1.c = cw2.c;
    cw2.c = temp;
  }

  // Driver method
  public static void main(String[] args) {
    Car3 c1 = new Car3(101, 1);
    Car3 c2 = new Car3(202, 2);
    CarWrapper cw1 = new CarWrapper(c1);
    CarWrapper cw2 = new CarWrapper(c2);
    swap(cw1, cw2);
    cw1.c.print();
    cw2.c.print();
  }
}
