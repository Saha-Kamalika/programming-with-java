package classFiles;
import java.util.*;
public class bridgesInGraphs{ //Tarjan's algo....bridge is an edge whose deletion increases the graphs no of connected components
    static class Edge{
        int src,dest,wt;

        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge> g[]){
        for(int i=0;i<g.length;i++)
            g[i]=new ArrayList<Edge>();

        g[0].add(new Edge(0,1));
        g[0].add(new Edge(0,2));
        g[0].add(new Edge(0,3));

        g[1].add(new Edge(1,0));
        g[1].add(new Edge(1,2));

        g[2].add(new Edge(2,1));
        g[2].add(new Edge(2,0));

        g[3].add(new Edge(3,4));
        g[3].add(new Edge(3,0));
        g[3].add(new Edge(3,5));

        g[4].add(new Edge(4,3));
        g[4].add(new Edge(4,5));

        g[5].add(new Edge(5,3));
        g[5].add(new Edge(5,4));
    }
    public static void dfs(ArrayList<Edge> g[],int curr,boolean vis[],int dt[],int low[],int time,int par) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for (int i = 0; i < g[curr].size(); i++) {
            Edge e = g[curr].get(i);
            if (e.dest == par)
                continue;
            else if (!vis[e.dest]) {
                dfs(g, e.dest, vis, dt, low, time, curr);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if (dt[curr] < low[e.dest]) {
                    System.out.println("Bridge is : " + curr + "-----" + e.dest);
                }
            }else low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }

    public static void bridge(ArrayList<Edge> g[],int V) {
        int dt[] = new int[V];//discovery time array
        int low[] = new int[V]; //lowest discovery time of all neighbours
        int time = 0;
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++)
            if (!vis[i])
                dfs(g, i, vis, dt, low, time, -1);
        }
    public static void main(String[] args)
    {
        int V=6;
        ArrayList<Edge> g[]=new ArrayList[V];
        createGraph(g);
        bridge(g,V);

    }
}      /*  1------0-------3
           |    /         | \
           |  /           |  5
            2             4/
   */
