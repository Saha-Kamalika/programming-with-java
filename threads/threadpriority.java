class MyThreadd1 extends Thread{
    public MyThreadd1(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thank you");
        while(true){
//            System.out.println("I am a thread");
            System.out.println("The name of the thread t1 is " +this.getName());
        }
    }
}
public class threadpriority  {
    public static void main(String[] args) {
        MyThreadd1 t1 = new MyThreadd1("Kamalika");
        MyThreadd1 t2 = new MyThreadd1("Rumi");
        MyThreadd1 t3 = new MyThreadd1("Kamal");
        MyThreadd1 t4 = new MyThreadd1("Alo");
        MyThreadd1 t5 = new MyThreadd1("Moni");
        MyThreadd1 t6 = new MyThreadd1("Jhumi");
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t6.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
//thread constructors:
/* Thread()
    Thread(String name)
    Thread(Runnable r)
    Thread(Runnable r,String name)
 */
