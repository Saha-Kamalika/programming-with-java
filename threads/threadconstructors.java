class MyThreadd extends Thread{
    public MyThreadd(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}
public class threadconstructors {
    public static void main(String[] args) {
        MyThreadd t1 = new MyThreadd("Kamalika");
        MyThreadd t2 = new MyThreadd("Rumi");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t1 is " + t1.getId());
        System.out.println("The name of the thread t1 is " + t1.getName());
        System.out.println("The id of the thread t2 is " + t2.getId());
        System.out.println("The name of the thread t2 is " + t2.getName());

    }
}
//thread constructors:
/* Thread()
    Thread(String name)
    Thread(Runnable r)
    Thread(Runnable r,String name)
 */