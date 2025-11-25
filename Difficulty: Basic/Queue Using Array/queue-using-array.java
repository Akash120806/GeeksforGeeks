class myQueue {
    int arr[];
    int size;
    int rear=-1;
    
    // Constructor
    public myQueue(int n) {
        arr= new int [n];
        this.size=n;
        
        // Define Data Structures
    }

    public boolean isEmpty() {
     return rear==-1;
        // Check if queue is empty
    }

    public boolean isFull() {
     return rear==size-1;
        // Check if queue is full
    }

    public void enqueue(int x) {
      
  
        if(isFull()){
            return;
        }
        rear++;
        arr[rear]=x;
        // Enqueue
    }

    public void dequeue() {
        if(isEmpty()){
            return;
        }
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        // Dequeue
    }

    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return arr[0];
        // Get front element
    }

    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
        // Get last element
    }
}
