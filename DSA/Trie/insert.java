import java.util.*;
public class Trie{
  static class Node{
    Node[] children;
    boolean eow;
    public Node(){
    children=new Node[26];
    for(int i=0;i<26;i++)
      children[i]=null;
    eow=false;
  }
}
  static Node root=new Node();
  public static void insert(String word){
    Node curr=root;
    for(int i=0;i<word.length();i++){
      int index=word.charAt(i)-'a';
      if(curr.children[index]==null)
        curr.children[index]=new Node();
      if(i==word.length()-1)
        curr.eow=true;
      curr=curr.children[index];
    }
  }
  public static void main(String[] args){
    String words[]={"the","a","their","any"};
    for(int i=0;i<words.length;i++)
      insert(words[i]);
    System.out.println("Insertion in trie successful");
}
}