package classFiles;
import java.util.*;
public class negativeWtCycle{ //single graph
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

        g[1].add(new Edge(1,2,-4));

        g[2].add(new Edge(2,3, 2));

        g[3].add(new Edge(3,4,4));

        g[4].add(new Edge(4,1,-1));
    }
    public static void bellman(ArrayList<Edge> g[],int src,int V){
        int dis[]=new int[V];
        for(int i=0;i<V;i++) {
            if (i != src)
                dis[i] = Integer.MAX_VALUE;
        }
        for(int k=0;k<V-1;k++){
            for(int i=0;i<V;i++){
                for(int j=0;j<g[i].size();j++){
                    Edge e=g[i].get(j);
                    int u=e.src;
                    int v=e.dest;
                    if(!(dis[u]==Integer.MAX_VALUE) && dis[u]+e.wt<dis[v]){   //Relaxation
                        dis[v]=dis[u]+e.wt;
                    }
                }
            }
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<g[i].size();j++){
                Edge e=g[i].get(j);
                int u=e.src;
                int v=e.dest;
                if(!(dis[u]==Integer.MAX_VALUE) && dis[u]+e.wt<dis[v]){   //Relaxation
                    System.out.println("Negative Weight Cycle");
                }
            }
        }
        for(int i=0;i<V;i++)
            System.out.println("0 -> "+i+" = "+dis[i]);

    }
    public static void main(String[] args)
    {
        int V=5;
        ArrayList<Edge> g[]=new ArrayList[V];
        createGraph(g);
        System.out.println("The shortest paths from source to all vertices are: ");
        bellman(g,0,V);

    }
}      /*   .1.
         |   \
       / |     \
      0  |       \ 4 .
       .\ |         |
         2  ----   .3
         Time complexity: O(V*E) */