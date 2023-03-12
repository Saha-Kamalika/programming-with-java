package classFiles;
//a vertex in an undirected connected graph is an aritculation point if removing it(and edges through it) disconnects the graph
import java.util.ArrayList;

public class ArticulationPt {
    static class Edge{
        int src,dest;

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

        g[4].add(new Edge(4,3));
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, int par,
                           boolean vis[], int dt[], int low[], int time,
                           boolean isArticulation[]) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int child = 0;
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(e.dest == par)
                continue;
            if(vis[e.dest]) {
                low[curr] = Math.min(low[curr], dt[e.dest]);
            } else {
                dfs(graph, e.dest, curr, vis, dt, low, time, isArticulation);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if(dt[curr] <= low[e.dest] && par != -1) {
                    isArticulation[curr] = true;
                }
                child++;
            }
        }
        if(par == -1 && child > 1) {
            isArticulation[curr] = true;
        }
    }
    public static void getArticulation(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean isArticulation[] = new boolean[V];
        for(int i=0; i<V; i++) {
            if(!vis[i]) {
                dfs(graph, i, -1, vis, dt, low, time, isArticulation);
            }
        }
        for(int i=0; i<V; i++) {
            if(isArticulation[i]) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args)
    {
        int V=5;
        ArrayList<Edge> g[]=new ArrayList[V];
        createGraph(g);
        System.out.println("The articulation points in this graph are: ");
        getArticulation(g,V);
    }
}

