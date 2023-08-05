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

  public static boolean startsWith(String pre) {
    Node curr = root;
    for (int i = 0; i < pre.length(); i++) {
      int indx = pre.charAt(i) - 'a';
      if (curr.children[indx] == null)
        return false;
      curr = curr.children[indx];
    }
    return true;
  }

  public static void main(String[] args) {
    String words[] = { "kamalika", "saha", "lika" };
    for (int i = 0; i < words.length; i++)
      insert(words[i]);
    System.out.println("Insertion in trie successful");
    System.out.println(startsWith("kama"));
  }
}