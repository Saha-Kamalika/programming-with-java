package classFiles;
public class diameterofBT{
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
    public static int height(Node root)
    {
        if(root==null)
            return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }
    public static int diameter(Node root) ////Time Complexity O(n*n)
    {
        if(root==null)
            return 0;
        int d1=diameter(root.left);
        int d2=diameter(root.right);
        int d3=height(root.left)+height(root.right)+1;
        return Math.max(Math.max(d1,d2),d3);
    }
    static class TreeIn {           ////Time Complexity O(n)
        int h;
        int d;

        TreeIn(int h, int d) {
            this.h = h;
            this.d = d;
        }
    }
        public static TreeIn diameter2(Node root){
            if(root==null)
                return new TreeIn(0,0);
            TreeIn left=diameter2(root.left);
            TreeIn right=diameter2(root.right);
            int mh=Math.max(left.h,right.h)+1;
            int d1=left.d;
            int d2=right.d;
            int d3=left.h+right.h+1;
            int md=Math.max(Math.max(d1,d2),d3);

            TreeIn m=new TreeIn(mh,md);
            return m;
        }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BTree t=new BTree();
        Node root=t.buildTree(nodes);
        System.out.println("Diameter of this BT is "+diameter(root)+"\nTime Complexity O(n*n)\n");
        System.out.println("Diameter of this BT is "+diameter2(root).d+"\nTime Complexity O(n)");
    }
}
