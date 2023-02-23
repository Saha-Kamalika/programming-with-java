package classFiles;
public class buildTreesPreorder {
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
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BTree t=new BTree();
        Node root=t.buildTree(nodes);
        System.out.println("The root is "+root.data);
    }
}
