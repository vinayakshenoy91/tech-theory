/*
- Every AVL tree is a BST
- If the height  of chidren is greater than 1, balacing starts
*/

class Node {
    constructor(value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.height = 1;
    }

    add(value) {
        if (value < this.value) {
            if (this.left) {
                this.left.add(value);
            } else {
                this.left = new Node(value);
            }
            if (!this.right || this.right.height < this.left.height) {
                this.height = this.left.height + 1;
            }
        } else {
            if (this.right) {
                this.right.add(value);
            } else {
                this.right = new Node(value);
            }
            if (!this.left || this.left.height < this.right.height) {
                this.height = this.right.height + 1;
            }
        }
        this.balance();
    }

    //If single  rotate on self, if double call rotate on child then on self
    balance() {

    }

    rotateRR() {
        this.right.updateInNewLocation();
        this.updateInNewLocation();
    }

    rotateLL() {
        this.left.updateInNewLocation();
        this.updateInNewLocation();
    }

    updateInNewLocation() {

    }

    toObject() {
        return this.root;
    }
}


class Tree {
    constructor() {
        this.root = null;
    }

    add(value) {
        if (this.root === null) {
            this.root = new Node(value);
        } else {
            this.root.add(value);
        }
    }

    toObject() {
        return this.root;
    }
}