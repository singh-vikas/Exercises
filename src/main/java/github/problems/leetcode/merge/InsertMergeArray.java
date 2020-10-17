package github.problems.leetcode.merge;

import java.util.LinkedList;

class InsertMergeArray {
  public int[][] insert(int[][] intervals, int[] newInterval) {

    LinkedList<int[]> merged = new LinkedList<>();

    int count = 0;

    while (count < intervals.length && intervals[count][1] < newInterval[0]) {
      merged.add(new int[] {intervals[count][0], intervals[count][1]});
      count++;
    }

    while (count < intervals.length && newInterval[1] >=intervals[count][0] ) {

      merged.add(new int[] {
        Math.min(intervals[count][0], newInterval[0]),
        Math.max(intervals[count][1], newInterval[1])});
      count++;
    }

    while (count < intervals.length) {
      merged.add(new int[] {intervals[count][0], intervals[count][1]});
      count++;
    }

    return merged.toArray(new int[merged.size()][]);
  }

  public static void main(String[] args) {

    int[][] arrInt = {{1, 3}, {6, 7}};
    int[] input = {2, 5};

    new InsertMergeArray().insert(arrInt, input);

  }
}
