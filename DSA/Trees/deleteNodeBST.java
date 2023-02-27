package classFiles;

public class deleteNodeBST {
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
    public static Node delete(Node root,int key) {
        if (root.data > key) 
            root.left = delete(root.left, key);
        else if (root.data < key)
            root.right = delete(root.right, key);
        else {
            if (root.left == null && root.right == null)
                return null;    //leaf node deletion
            if (root.left == null) //deleting node having 1 child
                return root.right;
            else if (root.right == null)
                return root.left;

            Node suc = inSuc(root.right); //deleting node having 2 nodes(node replaced by its inorder successor)
            root.data = suc.data;
            delete(root.right, suc.data);    //delete the inorder successor
        }
        return root;
    }
    public static Node inSuc(Node root)
    {
        while(root.left!=null)
            root=root.left;  //leftmost node in the right subtree of a node is its inorder successor
        return root;
    }
    public static void main(String[] args)
    {
        int v[]={4,2,6,1,8,9};
        Node root=null;
        for(int i=0;i<v.length;i++)
            root=insert(root,v[i]);
        System.out.println("The inorder traversal of the BST : ");
        inorder(root);
        delete(root,1);
        System.out.println("\nAfter deletion:  ");
        inorder(root);
    }
}

