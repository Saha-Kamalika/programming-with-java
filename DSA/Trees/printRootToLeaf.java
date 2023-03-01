package classFiles;
import java.util.ArrayList;
public class printRootToLeaf{
    static int count=0;
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
    public static void printRootToLeaf(Node root, ArrayList<Integer> p){
        if(root==null)
            return;
        p.add(root.data);
        if(root.left==null && root.right==null){

            printPath(p);
        }
        else{
            printRootToLeaf(root.left,p);
            printRootToLeaf(root.right,p);
        }
        p.remove(p.size()-1);
    }
    public static void printPath(ArrayList<Integer> p){
        count++;
        System.out.print("\nPath "+(count)+": ");
        for(int i=0;i<p.size();i++)
            System.out.print(p.get(i)+ "->");
        System.out.println();

    }
    public static void main(String[] args)
    {
        int v[]={4,2,6,1,8,9};
        Node root=null;
        for(int i=0;i<v.length;i++)
            root=insert(root,v[i]);
        System.out.println("The inorder traversal of the BST : ");
        inorder(root);
        printRootToLeaf(root, new ArrayList<>());
    }
}
