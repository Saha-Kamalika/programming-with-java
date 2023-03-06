package classFiles;
import java.util.*;
public class cycleDetection {  //uses recursion [stack]
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

        g[1].add(new Edge(1, 0));
        g[0].add(new Edge(0, 2));
        g[2].add(new Edge(2, 3));
        //g[3].add(new Edge(3, 0));
    }

    public static boolean isCycle(ArrayList<Edge> g[],boolean vis[],int curr,boolean rec[]){
        vis[curr]=true;
        rec[curr]=true;
        for(int i=0;i<g[curr].size();i++){
            Edge e=g[curr].get(i);
            if(rec[e.dest])
                return true;
            else if(!vis[e.dest]){
                if(isCycle(g,vis,e.dest,rec))
                    return true;
            }
        }
        rec[curr]=false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> g[] = new ArrayList[V];
        boolean vis[] = new boolean[V];
        boolean rec[] = new boolean[V];
        boolean ans=false;
        createGraph(g);
        for (int i = 0; i < V; i++) {       //takes every vertex as the starting vertex
            if (!vis[i]) {
                ans=isCycle(g,vis,0,rec);
                if(ans){
                    System.out.println("Cycle exists");
                    break;
            }}
        }
        if(!ans)
            System.out.println("Cycle doesn't exist");
    }
}
     /*   1 -. 0 .
              .|  \
               2 -.3
         */