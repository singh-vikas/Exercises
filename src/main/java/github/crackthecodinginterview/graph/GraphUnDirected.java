package github.crackthecodinginterview.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// This class represents a directed graph using adjacency list
// representation
public class GraphUnDirected {

  private final int V;//No of vertices

  List<List<Integer>> adjacencyList;

  GraphUnDirected(int V) {

    if (V < 0)
      throw new IllegalArgumentException("Invalid vertices count. Lower bound.");

    this.V = V; //Initialize the no of vertices

    adjacencyList = new ArrayList<>(V); //Initial capacity doesn't matter for Arraylist Dynamically grow.

    for (int i = 0; i < V; i++) {
      adjacencyList.add(new ArrayList<>());
    }
  }

  /**
   * Add an edge in the graph.
   * @param u
   * @param v
   */
  void addEdge(int u, int v) {
    adjacencyList.get(u).add(v);   //Undirected graph
    adjacencyList.get(v).add(u);   //Undirected graph
  }

  /**
   * BFS traversal.
   *
   * @param startVertex
   */
  void BFS(int startVertex) {

    // Mark all the vertices as not visited(By default
    // set as false)
    boolean[] visited = new boolean[V];

    Queue<Integer> queue = new LinkedList<>();
    queue.add(startVertex);           //Add the first vertex in the queue to process it.
    visited[startVertex] = true;

    while (!queue.isEmpty()) {
      int vertex = queue.peek();
      System.out.println(vertex);
      List<Integer> adjacentVertex = adjacencyList.get(vertex);

      adjacentVertex.forEach(ver -> {
        if (!visited[ver]) {
          visited[ver] = true;
          queue.add(ver);
        }
      });

      queue.remove(vertex);
    }
  }

  /**
   * DFS traversal.
   *
   * @param startVertex
   */
  void DFS(int startVertex) {
    boolean[] visited = new boolean[V];
    DFSUtil(startVertex, visited);
  }

  private void DFSUtil(int vertex, boolean[] visited) {
    List<Integer> adjacentVertex = adjacencyList.get(vertex);
    visited[vertex] = true;
    System.out.println(vertex);

    adjacentVertex.forEach(v -> {
      if (!visited[v])
        DFSUtil(v, visited);
    });
  }

  public static void main(String[] args) {

    GraphUnDirected g = new GraphUnDirected(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    System.out.println("Following is Breadth First Traversal " +
      "(starting from vertex 2)");

    g.BFS(2);

    System.out.println("Following is Depth First Traversal " +
      "(starting from vertex 2)");

    g.DFS(2);

  }

}
