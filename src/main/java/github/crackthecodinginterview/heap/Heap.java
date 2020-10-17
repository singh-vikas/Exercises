package github.crackthecodinginterview.heap;

import java.util.Random;

public class Heap {

  private int size;

  //Default capacity of the element.
  private final int DEFAULT_CAPACITY = 20;

  //Heap array.
  private int[] heap;

  Heap() {
    //Initialize the heap with it's default capacity.
    heap = new int[DEFAULT_CAPACITY];
  }

  /**
   * Insert the values into the heap.
   * @param value
   * @return
   */
  public void insert(final int value) {

    if (size == heap.length)
      throw new IllegalArgumentException("Heap is full");

    heap[size] = value;
    heapify(size);
    size++;
  }

  /**
   * Fix the heap.
   * @param size
   * @return
   */
  public void heapify(int size) {

    int index = size;
    int newValue = heap[size];

    while (index > 0 && newValue < heap[getParentIndex(index)]) {
      heap[index] = heap[getParentIndex(index)];
      index = getParentIndex(index);
    }

    heap[index] = newValue;
  }

  /**
   * Get parent index.
   *
   * @return
   */
  public int getParentIndex(int index) {
    return (index - 1) / 2;
  }

  public static void main(String[] args) {

    Heap heap = new Heap();

    int i = 20;
    Random random = new Random();
    while (i > 0) {
      //heap.insert(random.nextInt(100));
      heap.insert(i);
      i--;
    }

    StringBuilder str = new StringBuilder();
    int size = heap.size;
    while (size > 0) {
      str.append(" ,").append(heap.heap[size - 1]);
      size--;
    }
    System.out.println(str);
  }
}
