// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node head;
    Node tail;
    public myQueue() {
         head=null;
         tail= null;
        // Initialize your data members
    }

    public boolean isEmpty() {
        return head==null&&tail==null;
        // check if the queue is empty
    }

    public void enqueue(int x) {
        Node node= new Node(x);
        if(isEmpty()){
            head =tail= node;
            return;
        }
        tail.next=node;
        tail=node;
        // Adds an element x at the rear of the queue.
    }

    public void dequeue() {
        if(isEmpty()){
            return;
        }
        if(head==tail){
            tail=null;
        }
        head=head.next;
        // Removes the front element of the queue
    }

    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return head.data;
        // Returns the front element of the queue.
        // If queue is empty, return -1.
    }

    public int size() {
        if(isEmpty()){return 0;}
        Node temp =head;
        int s=0;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        return s;
        // Returns the current size of the queue.
    }
}
