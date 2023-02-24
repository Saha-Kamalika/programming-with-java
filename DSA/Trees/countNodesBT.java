package classFiles;
public class countNodesBT {
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
    public static int countNode(Node root)
    {
        if(root==null)
            return 0;
        int leftNode=countNode(root.left);
        int rightNode=countNode(root.right);
        return leftNode+rightNode+1;
    }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BTree t=new BTree();
        Node root=t.buildTree(nodes);
        System.out.println("Total nodes in this BT is "+countNode(root));
    }
}
