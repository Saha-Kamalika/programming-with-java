
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[V];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                list.add(curr);
                vis[curr]=true;
                for(int i=0;i<adj.get(curr).size();i++)
                    q.add(adj.get(curr).get(i));
            }
        }
        return list;
    }
}
