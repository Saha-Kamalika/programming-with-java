package classFiles;
public class subtreeOfAnotherTree {
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
    public static boolean isSame(Node root,Node subroot){
        if(subroot==null && root==null)
            return true;
        if(root==null || subroot==null)
            return false;
        if(root.data==subroot.data){
            return isSame(root.left,subroot.left) && isSame(root.right,subroot.right);
        }
        return false;
    }
    public static boolean issubTree(Node root,Node subroot){
        if(subroot==null)
            return true;
        if(root==null)
            return false;
        if(isSame(root,subroot))
            return true;
        return issubTree(root.left,subroot)||issubTree(root.right,subroot);
    }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int subnodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BTree t=new BTree();
        Node root=t.buildTree(nodes);
        BTree t1=new BTree();
        Node subroot = t1.buildTree(subnodes);
        System.out.println(issubTree(root,subroot));
    }
}
