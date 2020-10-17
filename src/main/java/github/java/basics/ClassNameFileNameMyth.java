package github.java.basics;

//https://www.geeksforgeeks.org/myth-file-name-class-name-java/
//The myth about the file name and class name should be same only when the class is declared in public.
//Remove public
 class ClassNameFileNameMythViolated {

  public static void main(String[] args)
  {
    System.out.println("Hello world");
  }
}


/*** File name: Trial.java ***/
class ForGeeks {
  public static void main(String[] args)
  {
    System.out.println("For Geeks class");
  }
}

class GeeksTest {
  public static void main(String[] args)
  {
    System.out.println("Geeks Test class");
  }
}
