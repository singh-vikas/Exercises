package github.educative.patterns.cyclicsort;

import static org.junit.Assert.*;

public class CyclicSortTest {

  @org.junit.Test
  public void sort() {
  }

  @org.junit.Test
  public void testSort() {

    int[] array = new int[] {4, 5, 2, 3, 1};
    CyclicSort cSort = new CyclicSort();
    cSort.sort(array);
  }
}
