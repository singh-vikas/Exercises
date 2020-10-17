package github.problems.practice;

/**
 *
 * HashTable:
 *
 * get
 * remove
 * put
 * size
 * toString()
 *
 */
public class HashMapDemo {

  private static int capacity = 100;
  private HashEntry[] entries = new HashEntry[capacity];
  private int count = 0;

  private class HashEntry {
    String key;
    String value;

    //Linked list of same Hash entries.
    HashEntry next;

    HashEntry(String key, String value) {
      this.key = key;
      this.value = value;
    }

    public String toString() {
      return "[" + key + ", " + value + "]";
    }
  }

  /**
   * Insert into hashTable demo.
   *
   * @param key
   * @param value
   */
  public void put(final String key, final String value) {

    int index = getHash(key);

    //Create the entry based on key and value.
    final HashEntry entry = new HashEntry(key, value);

    if (entries[index] == null) {
      entries[index] = entry;

    } else {    //if there is already an entry at the hashed index.
      HashEntry temp = entries[index];
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = entry;
    }

    count++; //Increment the count of each added value.
  }

  /**
   * Get the value based on input key.
   *
   * @param key
   * @return
   */
  public String get(String key) {

    int index = getHash(key);

    if (entries[index] == null)
      return null;

    if (entries[index].key == key) {
      return entries[index].value;
    }

    HashEntry temp = entries[index];

    while (temp.next.key == key) {
      temp = temp.next;
    }

    return temp.value;
  }

  /**
   * Remove the value from hashmap based on key.
   *
   * @param key
   * @return
   */
  public String remove(String key) {
    int index = getHash(key);

    HashEntry temp = entries[index];
    HashEntry prev = temp;

    while (temp.key == key) {
      prev = temp;
      temp = temp.next;
    }

    prev.next = temp.next;
    count--;

    return temp.value;  //Return the value removed as per input key.
  }

  /**
   * @param key
   * @return
   */
  public static int getHash(String key) {
    return Math.abs(key.hashCode()) % capacity;   //Absolute to make it handle -ve cases.
  }

  //Print the HashTable demo.
  public String toString() {
    int row = 0;

    StringBuilder output = new StringBuilder();

    for (HashEntry entry : entries) {

      if (entry == null)
        continue;

      output.append("\n row [" + row + "] ");

      HashEntry temp = entry;

      while (temp != null) {
        output.append("[" + temp.key + "," + temp.value + "]");
        temp = temp.next;
      }
      row++;
    }

    return output.toString();
  }

  public static void main(String[] args) {

    HashMapDemo demo = new HashMapDemo();

    demo.put("hello", "Vikas");
    demo.put("hello", "John");
    demo.put("hi", "Vikas");
    demo.put("hi", "John");
    demo.put("Bye", "John");
    demo.put("bye", "John");
    demo.put("carina", "John");  //Negative hashcode.

    System.out.println("HashTableDemo : size " + demo.count + "" + demo.toString());

  }
}

