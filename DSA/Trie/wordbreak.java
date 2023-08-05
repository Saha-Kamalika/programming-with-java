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

  public static boolean wordBreak(String key){
    if(key.length()==0) return true;
    for(int i=1;i<=key.length();i++){
      String first=key.substring(0,i);
      String sec=key.substring(i);
      if(search(first) && wordBreak(sec)) return true;
    }
    return false;
  }
  public static void main(String[] args) {
    String words[] = { "i","like","sam","samsung","mobile" };
    for (int i = 0; i < words.length; i++)
      insert(words[i]);
    System.out.println("Insertion in trie successful");
    String key="ilikesamsung";
    System.out.println(wordBreak(key));
  }
}