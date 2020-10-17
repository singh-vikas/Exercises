package github.java.basics;

// Java code to demonstrate Class Loader subsystem
public class ClassLoaders
{
  public static void main(String[] args)
  {
    // String class is loaded by bootstrap loader, and
    // bootstrap loader is not Java object, hence null
    System.out.println(String.class.getClassLoader());

    // ClassLoaders  class is loaded by Application loader
    System.out.println(ClassLoaders.class.getClassLoader());
  }


  //  JVM follow Delegation-Hierarchy principle to load classes.
  //  System class loader delegate load request to extension class loader and extension class loader delegate request to
  //  boot-strap class loader. If class found in boot-strap path, class is
  //  loaded otherwise request again transfers to extension class loader
  //  and then to system class loader. At last if system class loader fails to load class,
  //  then we get run-time exception java.lang.ClassNotFoundException.
}
