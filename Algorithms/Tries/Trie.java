package Tries;

public class Trie {

  private TrieNode root;

  public Trie(){
      root=new TrieNode();
      System.out.println("Trie has been created");
  }


  //O(M) space and time complexity
  public void insert(String word){

    TrieNode current = root;

    for(int x=0;x<word.length();x++){

      char ch = word.charAt(x);

      TrieNode node = current.map.get(ch);

      if(node==null){
        node=new TrieNode();
        current.map.put(ch,node);
      }
      current=node;

    }
    current.endOfString=true;

    System.out.println("Successfully inserted in trie");

  }


  //Time complexity is O(M)
  public boolean search(String word){
    TrieNode current = root;
    for(int i=0;i<word.length();i++){
      if (current.map.get(word.charAt(i))==null){
        System.out.println("Items not found");
        return false;
      }else{
        current = current.map.get(word.charAt(i));
      }
    }

    if(current.endOfString){
      return true;
    }else {
      return false;
    }

  }


  public boolean deleteHelper(TrieNode parentNode, String word,int index){

     char ch = word.charAt(index);
     TrieNode currentNode = parentNode.map.get(ch);
     boolean canThisNodeBeDeleted;

     if(currentNode.map.size()>1){
       deleteHelper(currentNode,word,index+1);
       return false;
     }

     if(index==word.length()-1){
       if(currentNode.map.size()>=1){
         currentNode.endOfString=false;
         return false;
       }else{
         parentNode.map.remove(ch);
         return true;
       }
     }
     //Some other word is prefix of this world
    if(currentNode.endOfString==true){
      deleteHelper(currentNode,word,index+1);
      return false;
    }

    canThisNodeBeDeleted= deleteHelper(currentNode,word,index+1);

    if(canThisNodeBeDeleted) {
      parentNode.map.remove(ch);
      return true;
    }
    return false;
  }

  public boolean delete(String word){

     if(search(word)==true){
       return deleteHelper(root, word,0);
     }
    return false;
  };



}
