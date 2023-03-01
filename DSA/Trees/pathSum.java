package classFiles;
import java.util.ArrayList;
public class pathSum{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int value)
    {
        if(root==null){
            root=new Node(value);
            return root;
        }
        if(root.data>value)
            root.left=insert(root.left,value);
        if(root.data<value)
            root.right=insert(root.right,value);
        return root;
    }
    public static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static int treeSum(Node root, int val)
    {
        if(root==null)
            return 0;
        val = (val*10 + root.data);
        // if current node is leaf, return the current value of val
        if (root.left==null && root.right==null)
            return val;
        // recur sum of values for left and right subtree
        return treeSum(root.left, val)+treeSum(root.right, val);
    }
    public static int treePathsSum(Node root) {
        // Pass the initial value as 0 as there is nothing above root
        return treeSum(root, 0);
    }
    public static void main(String[] args)
    {
        int v[]={4,2,6,1,8,9};
        Node root=null;
        for(int i=0;i<v.length;i++)
            root=insert(root,v[i]);
        System.out.println("The inorder traversal of the BST : ");
        inorder(root);
        System.out.println("\nSum of all the possible paths: ");
        System.out.println(treePathsSum(root));
    }
}
