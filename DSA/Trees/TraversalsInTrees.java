package classFiles;
import java.util.*;
public class TraversalsInTrees {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BTree{
        static int index=-1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index]==-1) //has no child
                return null;
            Node nnode=new Node(nodes[index]);
            nnode.left=buildTree(nodes); //builds the left child of the parent
            nnode.right=buildTree(nodes); //builds the right child of the parent
            return nnode;
        }
        }
    public static void preorder(Node root){   //Root LeftSubtree RightSubtree O(n)
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){ //LeftSubtree Root RightSubtree O(n)
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){ //LeftSubtree RightSubtree Root O(n)
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){ //bfs
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node cnode=q.remove();
            if(cnode==null){
                System.out.println();
                if(q.isEmpty())
                    break;
                else q.add(null);
            }
            else{
                System.out.print(cnode.data+" ");
                if(cnode.left!=null)
                    q.add(cnode.left);
                if(cnode.right!=null)
                    q.add(cnode.right);
            }
        }
    }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BTree t=new BTree();
        Node root=t.buildTree(nodes);
        System.out.print("The Preorder Traversal :");
        preorder(root);
        System.out.println();
        System.out.print("The Inorder Traversal :");
        inorder(root);
        System.out.println();
        System.out.print("The Postorder Traversal :");
        postorder(root);
        System.out.println();
        System.out.print("The Level order Traversal :\n");
        levelOrder(root);
    }
}

