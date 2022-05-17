package Heap;

public class Heap {

  private Node[] heapArray;

  private int maxSize;

  private int currentSize;


  public Heap(int size) {
    this.currentSize=0;
    this.maxSize=size;
    this.heapArray= new Node[size];
  }


  public int getSize(){
    return currentSize;
  }


  public boolean isEmpty(){

    return currentSize==0;

  }


  public boolean insert(int key){

    if(currentSize==maxSize){
      return false; //IndexOutOfBoundsException
    }

    Node newNode = new Node(key);
    heapArray[currentSize]=newNode;

    trickleUp(currentSize);

    currentSize++;

    return true;
  }

  public int getParentNodeIdx(int idx){

    return (idx-1)/2;

  }

  public void trickleUp(int idx){

     Node nodeToInsert = heapArray[idx];

     //loop as long as we haven't reached  the root and key of idx's parent is less than new Node

    while(idx>0 && heapArray[getParentNodeIdx(idx)].getKey()<nodeToInsert.getKey()){
       heapArray[idx] = heapArray[getParentNodeIdx(idx)];
       idx=getParentNodeIdx(idx);
    }
    heapArray[idx]=nodeToInsert;
  }


  public Node remove(){
    Node root = heapArray[0];

    currentSize--;

    heapArray[0]=heapArray[currentSize];

    trickleDown(0);

    return root;

  }


  public void trickleDown(int idx){

       int largerChildIdx;

       Node top = heapArray[idx]; // Save last variable into top

      // will run as long as index is not on the bottom row. Atleast one child present.


    while(idx<currentSize/2){

      int lChildIdx = 2*idx+1;

      int rChildIdx = 2*idx+2;

      if(rChildIdx<currentSize && heapArray[lChildIdx].getKey()< heapArray[rChildIdx].getKey()){
        largerChildIdx=rChildIdx;
      }else{
        largerChildIdx=lChildIdx;
      }

      if(top.getKey()>=heapArray[largerChildIdx].getKey()){
        break;
      }


      heapArray[idx]=heapArray[largerChildIdx];
      idx=largerChildIdx;
    }

    heapArray[idx]=top;






  }















}
