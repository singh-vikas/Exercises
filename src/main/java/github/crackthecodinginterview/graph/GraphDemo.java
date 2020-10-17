package github.crackthecodinginterview.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * https://algs4.cs.princeton.edu/41graph/
 * https://algs4.cs.princeton.edu/41graph/AdjMatrixGraph.java.html
 *
 *
 * Visual representation.
 *
 */
public class GraphDemo {

  public static void main(String[] args) {

    int V = 5;  // Number of vertices.
    List<List<Integer>> graph = new ArrayList<>(5);

    for (int i = 0; i < 10; i++) {
      graph.add(new ArrayList<>());   // ArrayList to store the edges.
    }

    addEdge(graph, 0, 1);
    addEdge(graph, 0, 4);
    addEdge(graph, 1, 2);
    addEdge(graph, 1, 3);
    addEdge(graph, 1, 4);
    addEdge(graph, 2, 3);
    addEdge(graph, 3, 4);
  }

  /**
   *
   * Add an edge = {u,v}
   * @param graph
   * @param u
   * @param v
   */
  private static void addEdge(List<List<Integer>> graph, int u, int v) {
    graph.get(u).add(v);
    graph.get(v).add(u);
  }

}
