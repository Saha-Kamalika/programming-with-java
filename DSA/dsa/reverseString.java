package dsa;

class Stack1 {
    int size;
    int top;
    char[] arr;

    Stack1(int size) {
        this.size = size;
        this.top = -1;
        this.arr = new char[size];
    }

    public void push(char data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
        System.out.println(data + " successfully pushed");
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return '\0'; // Return a null character to indicate stack underflow
        }
        return arr[top--];
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Cannot peek");
            return;
        }
        System.out.println(arr[top] + " peeked");
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class reverseString {
    public static void main(String[] args) {
        StringBuilder n = new StringBuilder("kamalika");
        int l = n.length();
        Stack1 s = new Stack1(l); // Corrected class name to Stack1
        for (int i = 0; i < l; i++) {
            s.push(n.charAt(i));
        }
        for (int i = 0; i < l; i++) {
            char c = s.pop();
            n.setCharAt(i, c);
        }
        System.out.println(n);
    }
}
