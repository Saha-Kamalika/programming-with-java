package classFiles;
import java.util.*;
public class bfs { //single graph
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

        g[1].add(new Edge(1,0));
        g[1].add(new Edge(1,3));

        g[2].add(new Edge(2,0));
        g[2].add(new Edge(2,4));

        g[3].add(new Edge(3,1));
        g[3].add(new Edge(3,4));
        g[3].add(new Edge(3,5));

        g[4].add(new Edge(4,2));
        g[4].add(new Edge(4,3));
        g[4].add(new Edge(4,5));

        g[5].add(new Edge(5,3));
        g[5].add(new Edge(5,4));
        g[5].add(new Edge(5,6));

        g[6].add(new Edge(6,5));
    }
    public static void bfsG(ArrayList<Edge> g[],int V){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[V];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<g[curr].size();i++){
                    Edge e=g[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int V=7;
        ArrayList<Edge> g[]=new ArrayList[V];
        createGraph(g);
        //bfs traversal
        System.out.println("The BFS traversal of the graph: ");
        bfsG(g,V);

    }
}
     /*   1 ----  3
         /        | \
        0         |  5 -- 6
         \        | /
          2 ----  4 */