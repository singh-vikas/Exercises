package github.problems.leetcode.dataStructures.stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

  Queue<Integer> q = new LinkedList<Integer>();

  static int top = -1;

  /** Initialize your data structure here. */
  public StackUsingQueue() {
    top = 0;
  }

  /** Push element x onto stack. */
  public void push(int x) {

    q.add(x);
    top++;

    int size = q.size();
    while (size > 1) {
      q.add(q.poll());
      size--;
    }
  }

  /** Removes the element on top of the stack and returns that element. */
  public int pop() {

    if (empty()) {
      return -1;
    }

    top--;
    return q.remove();
  }

  /** Get the top element. */
  public int top() {

    if (empty()) {
      return -1;
    }
    return q.peek();
  }

  /** Returns whether the stack is empty. */
  public boolean empty() {
    return q.isEmpty();
  }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
