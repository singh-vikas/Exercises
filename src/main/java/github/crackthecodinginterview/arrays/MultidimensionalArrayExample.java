package github.crackthecodinginterview.arrays;

public class MultidimensionalArrayExample {

  public static void main(String[] args) {

    // creating and initializing two dimensional array with shortcut syntax
    int[][] arrInt = {{1, 2}, {3, 4, 5}};
    for (int i = 0; i < arrInt.length; i++) {
      for (int j = 0; j < arrInt[i].length; j++) {
        System.out.print(arrInt[i][j] + " ");
      }
      System.out.println("");
    }

    // showing multidimensional arrays initializing
    int[][] arrMulti = new int[2][]; // yes it's valid

    arrMulti[0] = new int[2];
    arrMulti[1] = new int[3];

    arrMulti[0][0] = 1;
    arrMulti[0][1] = 2;
    arrMulti[1][0] = 3;
    arrMulti[1][1] = 4;
    arrMulti[1][2] = 5;

//    for (int i = 0; i < arrInt.length; i++) {
//      for (int j = 0; j < arrInt[i].length; j++) {  //arrInt[i] - first array on index i.
//        System.out.print(arrInt[i][j] + " ");
//      }
//      System.out.println("");
//    }

    arrMulti = reverseArray(arrMulti);

    for (int i = 0; i < arrMulti.length; i++) {
      for (int j = 0; j < arrMulti[i].length; j++) {  //arrInt[i] - first array on index i.
        System.out.print(arrMulti[i][j] + " ");
      }
      System.out.println("");
    }
  }

  static int[][] reverseArray(int[][] array) {

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length / 2; j++) {
        int temp = array[i][j];
        array[i][j] = array[i][array[i].length - 1 - j];
        array[i][array[i].length - 1 - j] = temp;
      }
    }

    return array;
  }
}

//  1 2
//  3 4 5
//  1 2
//  3 4 5
