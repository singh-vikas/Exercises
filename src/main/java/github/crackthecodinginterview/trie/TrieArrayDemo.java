package github.crackthecodinginterview.trie;

import java.util.Arrays;

class TrieArrayDemo {

  private final int ALPHABET_SIZE = 26;

  //Root of Trie Node.
  private final TrieNode root;

  TrieArrayDemo() {
    root = new TrieNode();
  }

  //TrieNode Data structures.
  class TrieNode {
    private TrieNode[] children;
    private boolean endOfWord;

    TrieNode() {
      children = new TrieNode[ALPHABET_SIZE];
      endOfWord = false;
    }
  }

  /**
   * Iterative insert into the TrieNode.
   *
   * @param input
   */
  public void insert(String input) {

    if (input == null || input == "")
      throw new IllegalArgumentException("Please check input");

    TrieNode current = root;
    for (int i = 0; i < input.length(); i++) {
      final char c = input.charAt(i);
      TrieNode node = current.children[c - 'A'];
      if (node == null) {
        node = new TrieNode();
        current.children[c - 'A'] = node;
      }
      current = node;
    }

    current.endOfWord = true;
  }

  //Iterative search in TrieNode.
  public boolean search(String search) {
    if (search == null || search == "")
      return false;

    TrieNode current = root;
    for (int i = 0; i < search.length(); i++) {
      final char c = search.charAt(i);
      TrieNode node = current.children[c - 'A'];
      if (node == null) {
        return false;
      }
      current = node;
    }

    return current.endOfWord;
  }

  public void delete(String input) {
    if (input == null || input == "") {
      throw new IllegalArgumentException("Please check input");
    }

    delete(root, input, 0);
  }

  public boolean delete(TrieNode current, String input, int i) {

    if (i == input.length()) {
      if (!current.endOfWord) {
        return false;
      }
      current.endOfWord = false;
      return isEmptyArray(current.children);
    }

    int index = input.charAt(i) - 'A';
    TrieNode node = current.children[index];
    if (node == null) {
      return false;
    }

    boolean shouldDeleteTheNode = delete(node, input, i + 1);
    if (shouldDeleteTheNode) {
      current.children[index] = null;
      return isEmptyArray(current.children);
    }

    return false;
  }

  private boolean isEmptyArray(TrieNode[] children) {
    return Arrays.asList(children).isEmpty();
  }

  public static void main(String args[]) {
    TrieArrayDemo demo = new TrieArrayDemo();
    demo.insert("ABC");
    demo.insert("ABCD");
    demo.insert("ABECD");
    System.out.println(demo.search("ABC"));
    demo.delete("ABC");
    System.out.println(demo.search("ABC"));
  }

}
