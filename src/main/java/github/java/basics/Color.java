package github.java.basics;

//Every enum constant represents an object of type enum.
//enum type can be passed as an argument to switch statement

 enum  Color {
  RED, GREEN, BLUE;

//  * internally above enum Color is converted to
//   class Color
//   {
//     public static final Color RED = new Color();
//     public static final Color BLUE = new Color();
//     public static final Color GREEN = new Color();
//   }*/

}



 class EnumDemo  {

   // enum declaration inside a class.
   enum  Color {
     RED, GREEN, BLUE;
   }

  // Driver method
  public static void main(String[] args)
  {
    Color c1 = Color.RED;
    System.out.println(c1);

    // Using valueOf(). Returns an object of
    // Color with given constant.
    // Uncommenting second line causes exception
    // IllegalArgumentException
    //valueOf() method returns the enum constant of the specified string value, if exists.
    System.out.println(Color.valueOf("RED"));
    // System.out.println(Color.valueOf("WHITE"));
  }
}

//
//   Enum and Inheritance :
//
//  All enums implicitly extend java.lang.Enum class. As a class can only extend one parent in Java, so an enum cannot extend anything else.
//  toString() method is overridden in java.lang.Enum class,which returns enum constant name.
//   enum can implement many interfaces.


//enum and constructor :
//
//enum can contain constructor and it is executed separately for each enum constant at the time of enum class loading.
//  We can’t create enum objects explicitly and hence we can’t invoke enum constructor directly.
