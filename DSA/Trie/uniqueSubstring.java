import java.util.*;

public class Trie {
  static class Node {
    Node[] children;
    boolean eow;

    public Node() {
      children = new Node[26];
      for (int i = 0; i < 26; i++)
        children[i] = null;
      eow = false;
    }
  }

  static Node root = new Node();

  public static void insert(String word) {
    Node curr = root;
    for (int i = 0; i < word.length(); i++) {
      int index = word.charAt(i) - 'a';
      if (curr.children[index] == null)
        curr.children[index] = new Node();
      if (i == word.length() - 1)
        curr.children[index].eow = true;
      curr = curr.children[index];
    }
  }

  public static boolean search(String key) {
    Node curr = root;
    for (int i = 0; i < key.length(); i++) {
      int index = key.charAt(i) - 'a';
      Node node = curr.children[index];
      if (node == null)
        return false;
      if (i == key.length() - 1 && node.eow == false)
        return false;
      curr = curr.children[index];
    }
    return true;
  }
  public static int countSub(Node root){
    int count=0;
    if(root==null) return 0;
    for(int i=0;i<26;i++){
      if(root.children[i]!=null) count+=countSub(root.children[i]);
    }
    return count+1;
  }
  public static void main(String[] args) {
    String word = "apple";
    for (int i = 0; i < word.length(); i++){
      String suf=word.substring(i);
      insert(suf);
    }
    System.out.println(countSub(root));
  }
}