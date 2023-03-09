package classFiles;
import java.util.*;
public class PrimsAlgo { //single graph
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

        g[0].add(new Edge(0,1,10));
        g[0].add(new Edge(0,2,15));
        g[0].add(new Edge(0,3,30));

        g[1].add(new Edge(1,0,10));
        g[1].add(new Edge(1,3,40));

        g[2].add(new Edge(2,0, 15));
        g[2].add(new Edge(2,3, 50));

        g[3].add(new Edge(3,1,40));
        g[3].add(new Edge(3,0,30));
        g[3].add(new Edge(3,2,50));

    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;
        public Pair(int node,int cost){
            this.node=node;
            this.cost=cost;
        }
        public int compareTo(Pair P){
            return this.cost-P.cost;
        }
    }
    public static void prims(ArrayList<Edge> g[],int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>(); //non mst set
        boolean vis[]=new boolean[V]; //mst set
        pq.add(new Pair(0,0));    //source node with distance 0
        int mstCost=0;
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(vis[curr.node]==false){
                vis[curr.node]=true;
                mstCost+=curr.cost;
                for(int i=0;i<g[curr.node].size();i++){
                    Edge e=g[curr.node].get(i);
                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest,e.wt));
                    }
                }
            }
        }
        System.out.println("The minimum cost of the MST is "+mstCost);
    }
    public static void main(String[] args)
    {
        int V=4;
        ArrayList<Edge> g[]=new ArrayList[V];
        createGraph(g);
        prims(g,V);
    }
}
     /*       0
           /  |   \
          1   |     2
           \  |   /
              3
         Time complexity: O(ElogE) */