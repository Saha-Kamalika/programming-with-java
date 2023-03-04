package classFiles;
import java.util.*;
public class DFS {  //uses recursion [stack]
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

        g[0].add(new Edge(0, 1));
        g[0].add(new Edge(0, 2));

        g[1].add(new Edge(1, 0));
        g[1].add(new Edge(1, 3));

        g[2].add(new Edge(2, 0));
        g[2].add(new Edge(2, 4));

        g[3].add(new Edge(3, 1));
        g[3].add(new Edge(3, 4));
        g[3].add(new Edge(3, 5));

        g[4].add(new Edge(4, 2));
        g[4].add(new Edge(4, 3));
        g[4].add(new Edge(4, 5));

        g[5].add(new Edge(5, 3));
        g[5].add(new Edge(5, 4));
        g[5].add(new Edge(5, 6));

        g[6].add(new Edge(6, 5));
    }

    public static void dfs(ArrayList<Edge> g[], int curr, boolean vis[]) {
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<g[curr].size();i++){
            Edge e=g[curr].get(i);
            if(vis[e.dest]==false)
                dfs(g,e.dest,vis);
            }
        }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> g[] = new ArrayList[V];
        boolean vis[] = new boolean[V];
        createGraph(g);
        //dfs traversal
        System.out.println("The DFS traversal of the graph: ");
        for (int i = 0; i < V; i++) {       //takes every vertex as the starting vertex
            if (vis[i] == false) {
                dfs(g, i, vis);
            }
        }
    }
}
     /*   1 ----  3
         /        | \
        0         |  5 -- 6
         \        | /
          2 ----  4 */