package classFiles;

public class printInRange {
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
    public static void printRange(Node root,int x,int y){
        if(root==null)
            return;
        if(root.data>=x && root.data<=y){
            printRange(root.left,x,y);
            System.out.print(root.data+" ");
            printRange(root.right,x,y);
        }
        else if(root.data>=y)
            printRange(root.right,x,y);
        else printRange(root.left,x,y);
    }
    public static void main(String[] args)
    {
        int v[]={4,2,6,1,8,9};
        Node root=null;
        for(int i=0;i<v.length;i++)
            root=insert(root,v[i]);
        System.out.println("The inorder traversal of the BST : ");
        inorder(root);
        System.out.println("\nNodes present in this range: ");
        printRange(root,2,8);
    }
}
