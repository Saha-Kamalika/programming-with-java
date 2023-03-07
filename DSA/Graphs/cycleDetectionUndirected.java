package classFiles;
import java.util.*;
public class cycleDetectionUndirected {  //uses recursion [stack]
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
        g[0].add(new Edge(0, 4));
        g[1].add(new Edge(1, 0));
        g[1].add(new Edge(1, 2));
        //g[1].add(new Edge(1, 4));
        g[2].add(new Edge(2, 3));
        g[2].add(new Edge(2, 1));
        g[4].add(new Edge(4, 0));
        g[4].add(new Edge(4, 5));
        //g[4].add(new Edge(4, 1));
        g[5].add(new Edge(5, 4));
    }

    public static boolean isCycle(ArrayList<Edge> g[],boolean vis[],int curr,int par){
        vis[curr]=true;
        for(int i=0;i<g[curr].size();i++){
            Edge e=g[curr].get(i);
            if(vis[e.dest] && par!=e.dest)
                return true;
            else if(!vis[e.dest]){
                if(isCycle(g,vis,e.dest,curr))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> g[] = new ArrayList[V];
        boolean vis[] = new boolean[V];
        boolean ans=false;
        createGraph(g);
        for (int i = 0; i < V; i++) {       //takes every vertex as the starting vertex
            if (!vis[i]) {
                ans=isCycle(g,vis,0,-1);
                if(ans){
                    System.out.println("Cycle exists");
                    break;
                }}
        }
        if(!ans)
            System.out.println("Cycle doesn't exist");
    }
}
     /*    1------2
          /       |
         0        3
          \
           4---5
         */