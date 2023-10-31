  import java.util.*;
  public class buildTree{
    static class Node{
      int data;
      Node left;
      Node right;
      Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
      }
    }
    static class BT{
      static int idx=-1;
      public static Node build(int nodes[]){
        idx++;
        if(nodes[idx]==-1) return null;
        Node nnode=new Node(nodes[idx]);
        nnode.left=build(nodes);
        nnode.right=build(nodes);
        return nnode;
      }
    }
    public static int kthLevelSum(Node root,int k){
      Queue<Node> q=new LinkedList<>();
      int level=1,sum=0;
      q.add(root);
      q.add(null);
      while(!q.isEmpty()){
        Node curr=q.remove();
        if(curr==null){
            level++;
            if(level>k) return sum;
            sum=0;
          if(q.isEmpty()) break;
          else q.add(null);
        }
        else{
          sum+=curr.data;
          if(curr.left!=null) q.add(curr.left);
          if(curr.right!=null) q.add(curr.right);
        }
      }
      return sum;
    }
    public static void main(String[] args){
      int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      BT tree=new BT();
      Node root=tree.build(nodes);
      int ans=kthLevelSum(root,3);
      System.out.println(ans);
    }
  }
