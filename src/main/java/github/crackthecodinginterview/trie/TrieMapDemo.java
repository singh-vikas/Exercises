package github.crackthecodinginterview.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * Crud operations trie node.
 * insert/read/ delete.
 */
public class TrieMapDemo {

  private final TrieNode root;

  TrieMapDemo() {
    root = new TrieNode();
  }

  //Our Tried Node structure.
  private class TrieNode {
    Map<Character, TrieNode> children;
    boolean endOfWord;

    TrieNode() {
      children = new HashMap<>();
      endOfWord = false;
    }
  }

  private void insert(String string) {

    if (string == null || string == "")
      throw new IllegalArgumentException("Input is empty. Please check input :" + string);

    //Point to current root node.
    TrieNode current = root;

    for (int i = 0; i < string.length(); i++) {
      Character letter = string.charAt(i);

      TrieNode node = current.children.get(letter);
      if (node == null) {
        node = new TrieNode();
        current.children.put(letter, node);
      }
      current = node;
    }

    //Last letter node as end of world.
    current.endOfWord = true;
  }

  private boolean search(String input) {

    if (input == null || input == "")
      throw new IllegalArgumentException("Input is empty. Please check input :" + input);

    TrieNode current = root;

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      TrieNode node = current.children.get(c);
      if (node == null)
        return false;
      current = node;
    }

    //Last letter node as end of world which tells us input string found or not.
    return current.endOfWord;
  }

  private boolean delete(String input) {
    if (input == null || input == "")
      throw new IllegalArgumentException("Input is empty. Please check input :" + input);

    return delete(root, input, 0);
  }

  private boolean delete(TrieNode current, String input, int i) {

    // If last character of key is being processed
    if (i == input.length()) {
      if (!current.endOfWord) {
        return false;
      }

      current.endOfWord = false;

      //if current has no other mapping then return true
      return current.children.size() == 0;
    }

    char c = input.charAt(i);
    TrieNode deleteNode = current.children.get(c);
    if (deleteNode == null) {
      return false;
    }

    //if true is returned then delete the mapping of character and trienode reference from map.
    boolean shouldDeleteTheNode = delete(deleteNode, input, i + 1);
    if (shouldDeleteTheNode) {
      current.children.remove(c);
      return current.children.size() == 0;
    }

    return false;
  }

  public static void main(String[] args) {
    TrieMapDemo demo = new TrieMapDemo();
    demo.insert("ABC");
    demo.insert("ABCD");
    demo.insert("DBCA");

    System.out.println("Found : " + demo.search("ABC"));

    demo.delete("ABC");
    System.out.println("Found : " + demo.search("ABC"));
  }

}
