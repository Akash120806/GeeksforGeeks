// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    Node head;

    public myStack() {
        head=null;
        // Initialize your data members
    }

    public boolean isEmpty() {
        if(head==null){
            return true;
        }
         return false;
        // check if the stack is empty
    }

    public void push(int x) {
        Node node= new Node(x);
        if(isEmpty()){
            head=node;
            return;
        }
        node.next=head;
        head=node;
        // Adds an element x at the rear of the stack.
    }

    public void pop() {
        if(!isEmpty()){
            head=head.next;
        }
        // Removes the front element of the stack.
    }

    public int peek() {
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        return top;
        // Returns the front element of the stack.
        // If stack is empty, return -1.
    }

    public int size() {
        if(isEmpty()){
            return 0;
        }
        int s=0;
        Node temp=head;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        return s;
        // Returns the current size of the stack.
    }
}
