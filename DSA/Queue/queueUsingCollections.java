package classFiles;
import java.util.*;
public class queueUsingCollections {
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        //Queue<Integer> q=new ArrayDeque<>(); //Queue is an interface, so it cannot be instantiated, LinkedList & ArrayDeque both implements Queue interface
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
