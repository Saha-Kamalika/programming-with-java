package classFiles;
import java.util.*;

// push- O(n) pop + peek- O(n)
public class queueUsing2Stacks {
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while(!s1.isEmpty())
                s2.push(s1.pop());
            s1.push(data);
            while(!s2.isEmpty())
                s1.push(s2.pop());
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue empty, can't peek");
                return -1;
            }
            return s1.peek();
        }

    }
    public static void main(String[] args){
        Queue q=new Queue();
        //Queue<Integer> q=new ArrayDeque<>(); //Queue is an interface, so it , LinkedList & ArrayDeque both implements Queue interface
        q.add(10);
        q.add(30);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println("Peeked element = "+q.peek());
            System.out.println("Dequeueing = "+q.remove());
        }
        System.out.println("Queue is now empty");
    }
}
