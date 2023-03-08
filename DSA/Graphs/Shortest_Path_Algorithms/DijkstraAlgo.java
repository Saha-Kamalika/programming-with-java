package classFiles;
import java.util.*;
public class DijkstraAlgo { //single graph
    static class Edge{
        int src,dest,wt;

        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<Edge> g[]){
        for(int i=0;i<g.length;i++)
            g[i]=new ArrayList<Edge>();

        g[0].add(new Edge(0,1,2));
        g[0].add(new Edge(0,2,4));

        g[1].add(new Edge(1,2,1));
        g[1].add(new Edge(1,3,7));

        g[2].add(new Edge(2,4, 3));

        g[3].add(new Edge(3,5,1));

        g[4].add(new Edge(4,3,2));
        g[4].add(new Edge(4,5,5));

    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        public Pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }
        public int compareTo(Pair P){
            return this.dist-P.dist;
        }
    }
    public static void dijkstra(ArrayList<Edge> g[],int src,int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int dis[]=new int[V];
        for(int i=0;i<V;i++) {
            if (i != src)
                dis[i] = Integer.MAX_VALUE;
        }
        boolean vis[]=new boolean[V];
        pq.add(new Pair(0,0));    //source node with distance 0
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(vis[curr.node]==false){
                vis[curr.node]=true;
                for(int i=0;i<g[curr.node].size();i++){
                    Edge e=g[curr.node].get(i);
                    int u=e.src;
                    int v=e.dest;
                    if(dis[u]+e.wt<dis[v]){   //Relaxation
                        dis[v]=dis[u]+e.wt;
                        pq.add(new Pair(v,dis[v]));
                    }
                }
            }
        }
        for(int i=0;i<V;i++)
            System.out.println("0 -> "+i+" = "+dis[i]);

    }
    public static void main(String[] args)
    {
        int V=6;
        ArrayList<Edge> g[]=new ArrayList[V];
        createGraph(g);
        System.out.println("The shortest paths from source to all vertices are: ");
        dijkstra(g,0,V);

    }
}
     /*  1  -----  3
       / |         | \
      0  |         |  5
       \ |         | /
         2  ----   4 */
