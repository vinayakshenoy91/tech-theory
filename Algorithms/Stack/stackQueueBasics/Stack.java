package stackQueueBasics;

public class Stack<V> {

	private V[] arr;
	private int maxSize;
	private int top;

	@SuppressWarnings("unchecked")
	public Stack(int max_size) {
		this.maxSize = max_size;
		this.top = -1; // initially when stack is empty
		this.arr = (V[]) new Object[max_size];// type casting Object[] to V[]
	}

	public int getCapacity() {
		return maxSize;
	}

	public boolean isEmpty() {
		return this.top == -1;
	}

	public boolean isFull() {
		return this.top == this.maxSize - 1;
	}

	public void push(V data) {
		if (!isFull()) {
			top = top + 1;
			this.arr[top] = data;
		} else {
			System.err.println("Stack is Full!");
			return;
		}
	}

	public V pop(V data) {
		if (!isEmpty()) {
			V temp = arr[top--];
			return temp;
		} else {
			System.err.println("Stack is empty!");
			return null;
		}
	}

	public V top() {

		if (isEmpty()) {
			return null;
		}
		return this.arr[top];

	}
}
