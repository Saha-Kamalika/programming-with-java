package classFiles;

public class searchBST {
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
    public static boolean search(Node root,int key){
        if(root==null)
            return false;
        if(root.data>key)
            return search(root.left, key);
        else if(root.data==key)
            return true;
        else return search(root.right,key);
    }
    public static void main(String[] args)
    {
        int v[]={4,2,6,1,8,9};
        Node root=null;
        for(int i=0;i<v.length;i++)
            root=insert(root,v[i]);
        System.out.println("The inorder traversal of the BST : ");
        inorder(root);
        System.out.println();
        if(search(root,2))
            System.out.println("Key Node found");
        else System.out.println("Key Node not found");
    }
}
