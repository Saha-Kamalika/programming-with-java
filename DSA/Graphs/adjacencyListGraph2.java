package classFiles;
import java.util.ArrayList;
public class adjacencyListGraph2 {
    static class Edge{
        int src,dest,weight;

        public Edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }
    public static void createGraph(ArrayList<Edge> g[]){
        for(int i=0;i<g.length;i++)
            g[i]=new ArrayList<Edge>();

        g[0].add(new Edge(0,2,2));

        g[1].add(new Edge(1,2,10));
        g[1].add(new Edge(1,3,0));

        g[2].add(new Edge(2,0,2));
        g[2].add(new Edge(2,1,10));
        g[2].add(new Edge(2,3,-1));

        g[3].add(new Edge(3,1,0));
        g[3].add(new Edge(3,2,-1));

    }
    public static void main(String[] args)
    {
        int V=4;
        ArrayList<Edge> g[]=new ArrayList[V];
        createGraph(g);
        System.out.println("The neighbors of the vertex 2 are: ");
        //printing the neighbors of a vertex
        for(int i=0;i<g[2].size();i++){
            Edge e=g[2].get(i);
            System.out.println(e.dest+", "+e.weight);
        }
    }
}
     /*
        0      3
         2\ -1/ \0
            2  _  1
               10
      */