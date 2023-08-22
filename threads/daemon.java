public class MyThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon())
            System.out.println("Im a daemon thread");
        else System.out.println("Im a user thread");
    }
    public static void main(String[] args){
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
