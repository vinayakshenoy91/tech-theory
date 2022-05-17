package com.collection.queue;

public class Queue<T extends Comparable<T>> {

	private Node<T> firstNode;

	private Node<T> lastNode;
	
    private int count;

	public boolean isEmpty() {
		return this.firstNode == null;
	}
	
	public int size() {
		return this.count;
	}

	public void enqueue(T data) {
		
		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<T>(data);
		this.lastNode.setNextNode(null);
	
		if(isEmpty()) {
			this.firstNode = this.lastNode;
		}else {
			oldLastNode.setNextNode(this.lastNode);
		}
		
		this.count++;
		
		
		
	}

	public T dequeue() {
		
		if (isEmpty()) {
			this.lastNode=null;
			return null;
		}
		T dataToDequeue = this.firstNode.getData();
		this.firstNode = this.firstNode.getNextNode();
		
		this.count--;
		return dataToDequeue;
	}

	public T peek() {
		
		if (isEmpty()) {
			return null;
		}
	
		return  this.firstNode.getData();

	}

}
