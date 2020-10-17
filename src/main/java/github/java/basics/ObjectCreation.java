package github.java.basics;

//1) Using new Keyword : Using new keyword is the most basic way to create an object. This is the most common way to create an object in java. Almost 99% of objects are created in this way. By using this method we can call any constructor we want to call (no argument or parameterized constructors).

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

// Java program to illustrate creation of Object
// using new keyword
class UsingNewkeyword {
  String name = "GeeksForGeeks";

  public static void main(String[] args) {
    // Here we are creating Object of
    // NewKeywordExample using new keyword
    UsingNewkeyword obj = new UsingNewkeyword();
    System.out.println(obj.name);
  }
}

//2) Using New Instance : If we know the name of the class & if it has a public default constructor we can create an object –Class.forName. We can use it to create the Object of a Class. Class.forName actually loads the Class in Java but doesn’t create any Object. To Create an Object of the Class you have to use the new Instance Method of the Class.

// Java program to illustrate creation of Object
// using new Instance
class NewInstanceExample {
  String name = "GeeksForGeeks";

  public static void main(String[] args) {
    try {
      Class cls = Class.forName("NewInstanceExample");  //JDBC
      NewInstanceExample obj =
        (NewInstanceExample) cls.newInstance();
      System.out.println(obj.name);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}

//
//3) Using clone() method: Whenever clone() is called on any object, the JVM actually creates a new object and copies all content of the previous object into it. Creating an object using the clone method does not invoke any constructor.
//  To use clone() method on an object we need to implement Cloneable and define the clone() method in it.
// Java program to illustrate creation of Object
// using clone() method
class CloneExample implements Cloneable {
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  String name = "GeeksForGeeks";

  public static void main(String[] args) {
    CloneExample obj1 = new CloneExample();
    try {
      CloneExample obj2 = (CloneExample) obj1.clone();
      System.out.println(obj2.name);
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}

//4) Using deserialization : Whenever we serialize and then deserialize an object, JVM creates a separate object. In deserialization, JVM doesn’t use any constructor to create the object.
//  To deserialize an object we need to implement the Serializable interface in the class.
// Java program to illustrate Serializing
// an Object.

class DeserializationExample implements Serializable {
  private String name;

  DeserializationExample(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    try {
      DeserializationExample d =
        new DeserializationExample("GeeksForGeeks");
      FileOutputStream f = new FileOutputStream("file.txt");
      ObjectOutputStream oos = new ObjectOutputStream(f);
      oos.writeObject(d);
      oos.close();
      f.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

// Java program to illustrate creation of Object
// using Deserialization.

class DeserializationExample2 {

  private String name;

  DeserializationExample2(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    try {
      DeserializationExample2 d;
      FileInputStream f = new FileInputStream("file.txt");
      ObjectInputStream oos = new ObjectInputStream(f);
      d = (DeserializationExample2) oos.readObject();
      System.out.println(d.name);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

//5) Using newInstance() method of Constructor class : This is similar to the newInstance() method of a class. There is one newInstance() method in the java.lang.reflect.Constructor class which we can use to create objects. It can also call parameterized constructor, and private constructor by using this newInstance() method.
//
//  Both newInstance() methods are known as reflective ways to create objects. In fact newInstance() method of Class internally uses newInstance() method of Constructor class.

// Java program to illustrate creation of Object
// using newInstance() method of Constructor class

class ReflectionExample {
  private String name;

  ReflectionExample() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    try {
      Constructor<ReflectionExample> constructor
        = ReflectionExample.class.getDeclaredConstructor();
      ReflectionExample r = constructor.newInstance();
      r.setName("GeeksForGeeks");
      System.out.println(r.name);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}



