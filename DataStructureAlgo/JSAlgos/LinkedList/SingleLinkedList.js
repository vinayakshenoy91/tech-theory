class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}



class SingleLinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
        this.length = 0;

    }

    //Push to end of list
    push(value) {
        let newNode = new Node(value);;
        if (!this.head) {
            this.head = newNode
            this.tail = this.head;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        ++this.length;
        return this;
    }

    //Traverse

    traverse() {
        let finalString = '';
        var current = this.head;
        while (current !== null) {
            finalString += `${current.value}->`;
            current = current.next;
        }
        if (finalString != '') {
            finalString += 'null';
        }
        console.log(finalString);
    }

    //
    pop() {

        if (!this.head) {
            return undefined;
        }
        let current = this.head;
        let newTail = current;
        while (current.next) {
            newTail = current;
            current = current.next;
        }
        this.tail = newTail;
        this.tail.next = null;
        --this.length;
        if (this.length == 0) {
            this.head = null;
            this.tail = null;
        }
        return current;
    }
}