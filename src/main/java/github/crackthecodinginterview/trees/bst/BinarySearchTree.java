package github.crackthecodinginterview.trees.bst;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

  //Define Node in BST.
  class Node {
    int data;
    Node leftNode;
    Node rightNode;

    Node(int data) {
      this.data = data;
      this.leftNode = this.rightNode = null;
    }
  }

  Node root;  //root node

  BinarySearchTree() {
    root = null;  //set root to null.
  }

  /**
   * Insert into the BST
   *
   * @param data
   */
  public void insert(int data) {
    root = insert(data, root);
  }

  /**
   * Insert the node.
   *
   * @param data
   * @param root
   */
  public Node insert(int data, Node root) {
    if (root == null) {
      //Create new node.
      return new Node(data);
    }

    if (root.data >= data) {
      root.leftNode = insert(data, root.leftNode);      //Set left child.
    } else {
      root.rightNode = insert(data, root.rightNode);     //Set right child.
    }

    return root;
  }

  public void inOrder() {
    System.out.println("In order :");
    inOrder(root);
  }

  /**
   * In order traversal of BST.
   *
   * @param root
   */
  public void inOrder(Node root) {
    if (root != null) {
      inOrder(root.leftNode);
      System.out.println(root.data);
      inOrder(root.rightNode);
    }
  }

  /**
   * Search in BST.
   *
   * @param data
   * @param root
   */
  public Node search(int data, Node root) {

    if (root == null || root.data == data) {
      return root;
    }

    if (data < root.data) {
      return search(data, root.leftNode);
    }

    return search(data, root.rightNode);
  }

  public void remove(int data) {
    root = remove(data, root);
  }

  /**
   * Remove element from BST.
   *
   * @param data
   */
  public Node remove(int data, Node root) {

    //Base case
    if (root == null) {
      return root;
    }

    // If the key to be deleted is smaller than the root's key,
    // then it lies in left subtree
    if (data < root.data) {
      root.leftNode = remove(data, root.leftNode);
    }
    // If the key to be deleted is greater than the root's key,
    // then it lies in right subtree
    else if (data > root.data) {
      root.rightNode = remove(data, root.rightNode);
    }
    // if key is same as root's key, then This is the node
    // to be deleted
    else {

      // node with only one child or no child
      if (root.leftNode == null) {
        return root.rightNode;
      } else if (root.rightNode == null) {
        return root.leftNode;
      }

      // node with two children: Get the inorder successor (smallest
      // in the right subtree)
      root.data = findMinValue(root.rightNode);

      // Delete the inorder successor
      root.rightNode = remove(root.data, root.rightNode);
    }

    return root;
  }

  /**
   * Find minimum value in BST.
   *
   * @param root
   * @return
   */
  private int findMinValue(Node root) {
    int min = root.data;
    while (root.leftNode != null) {
      min = root.leftNode.data;
      root = root.leftNode;
    }
    return min;
  }

  /**
   * height of binary tree using recursion.
   *
   * @param root
   * @return
   */
  private int heightOfBinaryTree(Node root) {

    if (root == null)
      return -1;

    int left = heightOfBinaryTree(root.leftNode);
    int right = heightOfBinaryTree(root.rightNode);

    return Math.max(left, right) + 1;
  }

  /**
   * Level order traversal.
   *
   * Time Complexity O(n).
   * Space Complexity Sparse BST - O(1)
   *
   *
   * @param root
   */
  private void levelOrderTraversalOfBinarySearchTree(Node root) {

    if (root == null)
      return;

    Queue<Node> queue = new LinkedList<Node>(); //Create a queue
    queue.add(root);                            // Add the root in the queue

    System.out.println("Level order traversal");

    while (!queue.isEmpty()) {
      Node currentNode = queue.peek();
      System.out.println(currentNode.data);

      if (currentNode.leftNode != null)               //Add left and right child in the queue of current node.
        queue.add(currentNode.leftNode);
      if (currentNode.rightNode != null)
        queue.add(currentNode.rightNode);

      queue.remove(currentNode);                      //Remove the current node form the queue since it is processed.
    }
  }

  private void preOrder(Node root) {

    if (root != null) {
      System.out.println(root.data);
      preOrder(root.leftNode);
      preOrder(root.rightNode);
    }
  }

  private void postOrder(Node root) {
    if (root != null) {
      preOrder(root.leftNode);
      preOrder(root.rightNode);
      System.out.println(root.data);
    }
  }

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(4);
    bst.insert(5);
    bst.insert(10);
    bst.insert(6);
    bst.insert(3);
    bst.insert(1);
    bst.inOrder(bst.root);
    System.out.println("Search:" + bst.search(1, bst.root).data);
    System.out.println("Remove data:" + 8);
    bst.remove(8);
    bst.inOrder();
    System.out.println("Height of Binary Tree:" + bst.heightOfBinaryTree(bst.root));
    bst.levelOrderTraversalOfBinarySearchTree(bst.root);

    System.out.println("PreOrder traversal");
    bst.preOrder(bst.root);
    System.out.println("PostOrder traversal");
    bst.postOrder(bst.root);
    System.out.println(isBinarySearchTree(bst.root));
  }

  /**
   * Check if give tree is BST.
   *
   * O(n)
   * @param root
   * @return
   */
  static boolean isBinarySearchTree(Node root) {
    return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private static boolean isBSTUtil(Node root, int minValue, int maxValue) {
    if (root == null)
      return true;

    //Recursive range check.
    return root.data > minValue &&
      root.data < maxValue &&
      isBSTUtil(root.leftNode, minValue, root.data) &&
      isBSTUtil(root.rightNode, root.data, maxValue);
  }

  /**
   * Print all possbile combinations throgh which arrays can be created.
   *
   * @param root
   */
  void printAllPossibleArrays(Node root) {

  }

  LinkedList<int[]> mergeArrays(int[] first, int[] second, LinkedList<int[]> list){

    list.clear();

    int[] mergedArray= new int[first.length+second.length];

    int i=0;
    for (; i < first.length; i++){
      mergedArray[i]= first[i];
    }
    for (; i < mergedArray.length; i++){
      mergedArray[i]= second[i];
    }
    list.add(mergedArray);

    int j=0;
    for (; j < second.length; j++){
      mergedArray[j]= second[j];
    }
    for (; j < mergedArray.length; j++){
      mergedArray[j]= first[j];
    }

    return list;
  }
}

