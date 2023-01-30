class MyThreads1 implements Runnable{
    int i;
    public void run() {
        while (i < 20000) {
            System.out.println("Thread1 class is running");
            i++;
        }
    }
}
class MyThreads2 implements Runnable{
    int i;
    public void run(){
        while(i<20000)
        {
            System.out.println("Now, Thread2 class is running");
            i++;
        }
    }
}
public class threadrunnable {
    public static void main(String[] args)
    {
        MyThreads1 t1=new MyThreads1();
        Thread g1=new Thread(t1);
        MyThreads2 t2=new MyThreads2();
        Thread g2=new Thread(t2);
        g1.start();
        g2.start();
    }
}

