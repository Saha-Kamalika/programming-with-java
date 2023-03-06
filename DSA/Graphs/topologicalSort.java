package classFiles;
import java.util.*;
public class topologicalSort {  //uses recursion [stack]
    static class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> g[]) {
        for (int i = 0; i < g.length; i++)
            g[i] = new ArrayList<Edge>();

        g[5].add(new Edge(5, 0));
        g[5].add(new Edge(5, 2));
        g[2].add(new Edge(2, 3));
        g[3].add(new Edge(3, 1));
        g[4].add(new Edge(4, 1));
        g[4].add(new Edge(4, 0));
    }

    public static void topSort(ArrayList<Edge> g[], boolean vis[], int curr, Stack<Integer> s) {
        vis[curr] = true;
        for (int i = 0; i < g[curr].size(); i++) {
            Edge e = g[curr].get(i);
            if (!vis[e.dest])
                topSort(g, vis, e.dest, s);
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> g[] = new ArrayList[V];
        boolean vis[] = new boolean[V];
        Stack<Integer> s = new Stack<>();
        createGraph(g);
        for (int i = 0; i < V; i++) {       //takes every vertex as the starting vertex
            if (!vis[i]) {
                topSort(g, vis, i, s);
            }
        }
        System.out.print("The Topological Sorted Order is ");
        while(!s.isEmpty())
            System.out.print(s.pop()+" ");
    }
}
     /*    5      4
           |.\  /.|
          .|  0   |.
           2--.3--.1     //Time complexity: O(V+E)
         */
