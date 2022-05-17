/*Stack can be created using array

- Searching - O(N)
- Accessing - O(N)
- Insertion - O(1)
- removal - O(1)



*/

//Stack using LL

class Node {
    constructor(value) {
        this.value = value;
        this.next = null
    }
}



//Add and remove from beginnign of stack
class Stack {

    constructor() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    push(value) {
        let newNode = new Node(value);
        if (this.first == null) {
            this.first = newNode;
            this.last = newNode;
        } else {
            var temp = this.first;
            this.first = newNode;
            this.first.next = temp;
        }
        ++this.size;
    }


    pop() {
        if (this.first == null) {
            return null;
        }
        let temp = this.first.value;
        if (this.first === this.last) {
            this.last = null;
        }
        this.first = this.first.next;
        --this.size;
        return temp;
    }

    peek() {
        if (this.first == null) {
            return null
        }
        return this.first.value;
    }
}