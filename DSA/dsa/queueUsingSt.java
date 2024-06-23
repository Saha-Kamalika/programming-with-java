//import java.util.*;
//public class Main {
//    static class Qu{
//        static Stack<Integer> s1=new Stack<Integer>();
//        static Stack<Integer> s2=new Stack<Integer>();
//        public void enqueue(int data){
////            while(!s1.isEmpty()){
//                s2.push(s1.pop());
//            }
//            s1.push(data);
//            while(!s2.isEmpty()){
//                s1.push(s2.pop());
//            }
//            System.out.println(data+" enqueued");
//        }
//        public int dequeue(){
//            if(s1.isEmpty()) return -1;
//            else{
//                int p=s1.peek();
//                s1.pop();
//                return p;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Qu q=new Qu();
//        q.enqueue(1);
//        q.enqueue(2);
//        q.enqueue(3);
//        q.enqueue(4);
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//    }
//}
//
