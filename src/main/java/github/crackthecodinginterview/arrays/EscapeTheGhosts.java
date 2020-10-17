package github.crackthecodinginterview.arrays;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class EscapeTheGhosts {

  public boolean escapeGhosts(int[][] ghosts, int[] target) {

    int max = distance(target, new int[] {0, 0});

    for (int[] ghost : ghosts) {
      int d = distance(ghost, target);
      if (d <= max)
        return false;
    }
    return true;
  }

  public int distance(int[] pointA, int[] pointB) {
    return Math.abs(pointA[0] - pointB[0]) + Math.abs(pointA[1] - pointB[1]);
  }

  public static void main(String[] args) {

    int[][] ghosts = {{1, 0}, {0, 3}};
    int[] target = {0, 1};

    //System.out.print(new EscapeTheGhosts().escapeGhosts(ghosts, target));

    int i=0;
    System.out.print(++i);

  }

}
