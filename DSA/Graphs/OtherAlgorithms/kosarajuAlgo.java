
package classFiles;
import java.util.*;
public class kosarajuAlgo{  //only for directed graphs
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

        g[0].add(new Edge(0, 3));
        g[3].add(new Edge(3, 4));
        g[1].add(new Edge(1, 0));
        g[2].add(new Edge(2, 1));
        g[0].add(new Edge(0, 2));
    }
    public static void dfs(ArrayList<Edge> g[],int curr,boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<g[curr].size();i++) {
            Edge e = g[curr].get(i);
            if (!vis[e.dest])
                dfs(g, e.dest, vis);
        }
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
    public static void kosaraju(ArrayList<Edge> g[],int V){
        //creating stack based on topological sort O(V+E)
        Stack<Integer> s=new Stack<>();
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++)
            if(!vis[i])
                topSort(g,vis,i,s);

        //transposing the graph O(V+E)
        ArrayList<Edge> trans[] = new ArrayList[V];
        for (int i = 0; i < g.length; i++) {
            vis[i] = false;
            trans[i] = new ArrayList<Edge>();
        }
        for(int i=0;i<V;i++)
            for(int j=0;j<g[i].size();j++) {
                Edge e = g[i].get(j);
                trans[e.dest].add(new Edge(e.dest, e.src));
            }

        //dfs on trans[] O(V+E)
        for(int i=0;i<V;i++)
            if(!vis[i]){
                dfs(trans,i,vis);
                System.out.println();
            }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> g[] = new ArrayList[V];
        boolean vis[] = new boolean[V];
        Stack<Integer> s = new Stack<>();
        createGraph(g);
        System.out.println("All the strongly connected components in the graph are ");
        kosaraju(g,V);
    }
}
//kosaraju algorithm is an algorithm for finding the strongly connected components in a graph(it is a component in which we can reach every vertex of the component from every other vertex in that component
