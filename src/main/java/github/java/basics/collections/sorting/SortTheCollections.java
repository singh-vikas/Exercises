package github.java.basics.collections.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortTheCollections {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();

    Collections.sort(list, Integer::compare);

  }

  public int[][] merge(int[][] intervals) {


    LinkedList<int[]> merged= new LinkedList<>();

    for(int[] interval : intervals){

      if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
        merged.add(interval);
      }

      else{
        merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
      }
    }

    return merged.toArray(new int[merged.size()][]);
  }
}
