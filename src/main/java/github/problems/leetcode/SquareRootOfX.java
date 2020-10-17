package github.problems.leetcode;

public class SquareRootOfX {

  public int bruteForceMySqrt(int x) {
    // 0 and 1 -- Sqrt is x.
    if (x == 0 || x == 1) {
      return x;
    }

    //Sqrt would  be smaller or equal to i.
    int sqrt = 0;

    for (int i = 1; i * i <= x; i++) {       //i*i exceeding integer problem x/i is better.
      sqrt = i;
      if (i * i == x)
        return sqrt;
    }

    return sqrt;
  }

  public int bruteForceAnother(int x) {
    // 0 and 1 -- Sqrt is x.
    if (x == 0 || x == 1) {
      return x;
    }

    //Sqrt would  be smaller or equal to i.
    for (int i = 1; i * i <= x; i++) {
      if (i * i <= x && (i + 1) * (i + 1) <= x)
        return i;
    }
    return -1;
  }

  public int newtonSolution(int x) {
    // 0 and 1 -- Sqrt is x.
    if (x == 0 || x == 1) {
      return x;
    }

    long i = x;
    while (i * i > x) {
      i = (i + x / i) / 2;
    }
    return (int) i;
  }

  public int binarySearchSolution(int x) {
    // 0 and 1 -- Sqrt is x.
    if (x == 0 || x == 1) {
      return x;
    }

    int start = 1;
    int end = x;

    while (start < end) {
      int mid = start + (end - start) / 2;
      if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
        return mid;
      } else if (mid > x / mid) {
        end = mid;
      } else {
        start = mid+1;
      }
    }
    return -1;
  }
}
