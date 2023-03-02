package classFiles;
import java.util.ArrayList;
public class adjacencyListGraph1 {
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

        g[0].add(new Edge(0,2));

        g[1].add(new Edge(1,2));
        g[1].add(new Edge(1,3));

        g[2].add(new Edge(2,0));
        g[2].add(new Edge(2,1));
        g[2].add(new Edge(2,3));

        g[3].add(new Edge(3,1));
        g[3].add(new Edge(3,2));

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
            System.out.print(e.dest+" ");
        }
    }
}
     /*
        0   3
         \ / \
          2   1     //undirected unweighted graph
      */
