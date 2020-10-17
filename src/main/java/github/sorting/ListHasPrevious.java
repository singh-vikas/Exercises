package github.sorting;

import java.util.ArrayList;
import java.util.List;

public class ListHasPrevious {

  public static void main(String[] args) {
    List<List<Integer>> lists = new ArrayList<>();

    List<Integer> list = new ArrayList<Integer>(lists.get(0));
    list.add(5);

    lists.add(list);


    List<Integer> list2 = new ArrayList<Integer>(list);



  }

}
