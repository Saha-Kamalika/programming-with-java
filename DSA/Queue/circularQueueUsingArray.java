package classFiles;
public class circularQueueUsingArray {
    static class Queue {
        static int arr[], i;
        static int size, rear = -1, front = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue empty can,t dequeue");
                return -1;
            }
            int r = arr[front];
            if (rear == front)
                rear = front = -1;
            else front = (front + 1) % size;
            return r;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue empty can,t peek");
                return -1;
            }
            return arr[front];
        }
    }
        public static void main(String[] args) {
            Queue q = new Queue(4);
            q.add(30);
            q.add(60);
            q.add(1);
            q.add(90);
            System.out.println("Peeked element = " + q.peek());
            System.out.println("Dequeueing " + q.remove());
            q.add(97);
            System.out.println("Enqueued new element successfully");
            System.out.println("Peeked element = " + q.peek());
        }
    }

