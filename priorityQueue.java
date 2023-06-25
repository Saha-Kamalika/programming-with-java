import java.util.*;
public class priorityQueue{
  public static void main(String[] args){
    PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
    pq.add(10);
    pq.add(20);
    pq.add(30);

    System.out.println(pq.peek());

    System.out.println(pq.poll());
    System.out.println(pq.peek());
  }
}