package classFiles;
public class stackUsingLL {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class Stack {
        public static Node head;
        public static boolean isEmpty() {
            if (head == null)
                return true;
            return false;
        }
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop() {
            if (isEmpty())
                return -1;
            else {
                int top = head.data;
                head = head.next;
                return top;
            }
        }
        public static int peek() {
            if (isEmpty())
                return -1;
            return head.data;
        }
    }
        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(10);
            s.push(20);
            s.push(50);
            while (!s.isEmpty()) {
                System.out.println("Peeked element = " + s.peek());
                System.out.println("Popping " + s.pop() + "....");
            }
            System.out.println("Stack is empty now");
        }
    }

