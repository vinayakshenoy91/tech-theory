package Tries;

public class TrieCreation {

  public static void main(String[] args) {
     Trie trie = new Trie();

     trie.insert("App");
     trie.insert("Apple");

     trie.delete("App");

     if(trie.search("Apple")){
       System.out.println("Found item");
     }else{
       System.out.println("Not Found item");
     }
  }

}
