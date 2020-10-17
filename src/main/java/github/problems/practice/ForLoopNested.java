package github.problems.practice;

public class ForLoopNested {

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {

      for (int j = 0; j < 10; j++) {
        if (j == 5) {
          System.out.println("InnerForLoop" + j);
          break;
        }
      }

      System.out.println("OuterForLoop" + i);

    }
  }
}
