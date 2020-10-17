package github.crackthecodinginterview.ooad;

import java.util.Iterator;

public class CircularArray<T> implements Iterable<T> {

  T[] items;
  int head = 0;

  CircularArray(int size) {
    items = (T[]) new Object[size];
  }

  /**
   * Convert to correct circular index.
   *
   * @param index
   * @return
   */
  public int convert(int index) {

    if (index < 0) {
      index = items.length + index;
    }
    return (head + index) % items.length;
  }

  public T get(int index) {
    return items[convert(index)];
  }

  public void set(int i, T item) {
    items[convert(i)] = item;
  }

  @Override public Iterator<T> iterator() {
    return new CircularArrayIterator<T>(this);
  }
}

class CircularArrayIterator<T> implements Iterator<T> {

  private int _current = 1;
  private T[] _items;

  public CircularArrayIterator(CircularArray<T> array) {
    this._items = array.items;
  }

  @Override
  public boolean hasNext() {
    return _current < _items.length - 1;
  }

  @Override
  public T next() {
    _current++;
    return _items[convert(_current)];
  }

  private int convert(int current) {
    return 0;
  }

  @Override
  public void remove() {

  }
}

