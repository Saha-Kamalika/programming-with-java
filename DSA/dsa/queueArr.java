package dsa;

class Queue {
    int front;
    int rear;
    int size;
    int arr[];

    Queue(int size) {
        this.size = size; // Initialize size
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue full");
            return;
        }
        if (front == -1) { // Both front and rear should be set to 0 initially
            front = 0;
        }
        arr[++rear] = data; // Increment rear then assign
        System.out.println(data + " Enqueued");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return;
        }
        System.out.println("Dequeued: " + arr[front]);
        if (front == rear) { // Queue becomes empty
            front = -1;
            rear = -1;
        } else {
            front++; // Increment front
        }
    }

    public int getFront() { // Renamed to avoid conflict
        if (!isEmpty()) {
            return arr[front];
        }
        System.out.println("Queue empty");
        return -1; // Return a sentinel value
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class queueArr {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(7);

        q.display();

        q.dequeue();

        q.display();

        System.out.println("Front element: " + q.getFront());

        System.out.println("Is queue empty? " + q.isEmpty());
        System.out.println("Is queue full? " + q.isFull());
    }
}
