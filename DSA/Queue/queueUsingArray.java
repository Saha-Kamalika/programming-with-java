package classFiles;
public class queueUsingArray {
    static class Queue{
        static int arr[];
        static int size,rear=-1;
        Queue(int size){
            arr=new int[size];
            this.size=size;
        }
        public static boolean isEmpty()
        {
            return rear==-1;
        }
        public static void add(int data)
        {
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()) {
                System.out.println("Queue empty can,t dequeue");
                return -1;
            }
            int front=arr[0],i;
            for(i=0;i<rear;i++)
                arr[i]=arr[i+1];
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()) {
                System.out.println("Queue empty can,t peek");
                return -1;
            }
            return arr[0];
        }
    }
      public static void main(String[] args){
          Queue q=new Queue(4);
          q.add(30);
          q.add(60);
          q.add(1);
          while (!q.isEmpty()) {
              System.out.println("Peeked element = " + q.peek());
              System.out.println("Dequeueing " + q.remove() + "....");
          }
          System.out.println("Queue is empty now");
      }

}
