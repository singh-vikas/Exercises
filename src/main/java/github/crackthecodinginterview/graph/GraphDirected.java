package github.crackthecodinginterview.graph;

// Java program to print BFS traversal from a given source vertex.

import java.lang.reflect.Array;
import java.util.*;

// This class represents a directed graph using adjacency list representation.

class GraphDirected {
  private int V; // No. of vertices
  private LinkedList<Integer> adj[]; //Adjacency Lists


  // Constructor
  GraphDirected(int v) {
    this.V = v;
    adj = new LinkedList[v];
    for (int i = 0; i < v; ++i)
      adj[i] = new LinkedList();
  }

  // Function to add an edge into the graph
  void addEdge(int v, int w) {
    adj[v].add(w);   //Directed graph - one directional Edge
  }

  // prints BFS traversal from a given source s
  void BFS(int s) {
    // Mark all the vertices as not visited(By default
    // set as false)
    boolean visited[] = new boolean[V];

    // Create a queue for BFS
    LinkedList<Integer> queue = new LinkedList<Integer>();

    // Mark the current node as visited and enqueue it
    visited[s] = true;
    queue.add(s);

    while (queue.size() != 0) {
      // Dequeue a vertex from queue and print it
      s = queue.poll();
      System.out.print(s + " ");

      // Get all adjacent vertices of the dequeued vertex s
      // If a adjacent has not been visited, then mark it
      // visited and enqueue it
      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext()) {
        int n = i.next();
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
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
    List<Integer> adjacentVertex = adj[vertex];
    visited[vertex] = true;
    System.out.println(vertex);

    adjacentVertex.forEach(v -> {
      if (!visited[v])
        DFSUtil(v, visited);
    });
  }

  /**
   * Route between two nodes present or not.
   *
   * @param source
   * @param destination
   * @return
   */
  private boolean routeBetweenNodes(int source, int destination) {

    Iterator<Integer> listIterator = adj[source].listIterator();

    while (listIterator.hasNext()) {
      if (destination == listIterator.next())
        return true;
    }
    return false;
  }

  // Driver method to
  public static void main(String args[]) {
    GraphDirected g = new GraphDirected(4);

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

    System.out.println("Route between two nodes 2 and 3" + g.routeBetweenNodes(2, 1));
  }
}

