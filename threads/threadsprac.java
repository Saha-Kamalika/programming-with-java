class MyThread1 extends Thread {
    int i;
    public void run() {
        while (i < 20000) {
            System.out.println("Thread1 class is running");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    int i;
    public void run(){
        while(i<20000)
        {
            System.out.println("Now, Thread2 class is running");
            i++;
        }
    }
}
public class threadsprac {
    public static void main(String[] args)
    {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}
