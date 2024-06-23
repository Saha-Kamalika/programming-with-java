import java.util.*;
public class binaryTree {
    static class node{
        int data;
        node left;
        node right;
        node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BT{
        static int idx=-1;
        public static node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1) return null;

            node nn=new node(nodes[idx]);
            nn.left=buildTree(nodes);
            nn.right=buildTree(nodes);
            return nn;
        }
        public static void levelOrder(node root){
            if(root==null) return;
            Queue<node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                node curr=q.remove();
                if(curr==null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else q.add(null);
                }
                else{
                    System.out.print(curr.data+" ");
                    if(curr.left!=null) q.add(curr.left);
                    if(curr.right!=null) q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        BT b=new BT();
        int nodes[]={1,2,3,-1,-1,4,-1,-1,5,-1,6,-1,-1};
        node root=b.buildTree(nodes);
        b.levelOrder(root);
    }
}
