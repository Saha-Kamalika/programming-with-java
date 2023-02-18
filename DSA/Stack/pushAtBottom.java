package classFiles;
import java.util.*;
public class pushAtBottom {
    public static void pushBottom(int data,Stack<Integer> s) {
        if (s.size() == 0) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(50);
        pushBottom(25,s);
        while (!s.isEmpty()) {
            System.out.println("Peeked element = " + s.peek());
            System.out.println("Popping " + s.pop() + "....");
        }
        System.out.println("Stack is empty now");
    }
}

