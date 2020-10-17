package github.java.basics;

//https://www.geeksforgeeks.org/jvm-shutdown-hook-java/

public class ShutDownHook
{
  public static void main(String[] args)
  {

    Runtime.getRuntime().addShutdownHook(new Thread()
    {
      public void run()
      {
        System.out.println("Shutdown Hook is running !");
      }
    });
    System.out.println("Application Terminating ...");
  }
}


class ThreadChild extends Thread {

  public void run() {

    System.out.println("In clean up code");
    System.out.println("In shutdown hook");
  }
}

class Demo {

  public static void main(String[] args) {

    Runtime current = Runtime.getRuntime();
    current.addShutdownHook(new ThreadChild());

    for(int i = 1; i <= 10; i++)
      System.out.println("2 X " + i + " = " + 2 * i);
  }
}

