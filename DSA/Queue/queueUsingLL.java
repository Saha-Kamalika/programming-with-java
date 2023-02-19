package classFiles;
public class queueUsingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Queue {
        static Node head=null,tail=null;
        public static boolean isEmpty() {
            return head==null && tail==null;
        }
        public static void add(int data) {
            Node nnode=new Node(data);
            if(tail==null){
                head=tail=nnode;
                return;
            }
            tail.next=nnode;
            tail=nnode;
        }
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue empty can,t dequeue");
                return -1;
            }
            int front=head.data;
            if(tail==head)
                tail=null;
            head=head.next;
            return front;
        }
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue empty can,t peek");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(30);
        q.add(60);
        q.add(1);
        q.add(90);
        while(!q.isEmpty()) {
            System.out.println("Peeked element = " + q.peek());
            System.out.println("Dequeueing " + q.remove());
        }
    }
}

