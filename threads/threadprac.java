package classFiles;
class Thread1 extends Thread {
    public void run() {
        /*while (true) {
            System.out.println("Good Morning");
        }*/
    }
}
class Thread2 extends Thread{
    public void run() {
        /*while (true) {
            try {
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }*/
    }
}
public class threadprac {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        t2.start();
        System.out.println(Thread.currentThread().getState());
    }
}
