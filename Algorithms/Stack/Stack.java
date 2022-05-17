package Stack;

public class Stack {

  private int maxSize;

  private long[] stackArray;

  private int top;


  public Stack(int size){
     this.maxSize=size;
     this.stackArray= new long[size];
     this.top=-1;
  }

  public void push(long j) throws Exception {

    if(isFull()){
      throw new Exception("Stack is full");
    }

    ++top;
    stackArray[top]=j;

  }

  public long pop() throws Exception {
    if(isEmpty()){
      throw new Exception("Stack is Empty");
    }

    return stackArray[top--];

  }

  public long peek(){
    return stackArray[top];
  }

  public boolean isEmpty(){
    return top==-1;
  }

  public boolean isFull(){
    return top==maxSize-1;
  }



}
