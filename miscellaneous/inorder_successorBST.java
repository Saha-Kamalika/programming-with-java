class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
          int ind=-1;
          inorder(root);
          if(list.contains(x)){
              ind=list.indexOf(x)+1;
          }
          if(ind>=list.size()) return null;
          return list.get(ind);
         }
    List<Node> list=new ArrayList<>();
    public void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
}
