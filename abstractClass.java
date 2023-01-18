abstract class Parent2{
    abstract void greet();
    abstract void greet2();
}
class Child2 extends Parent2{
    void greet(){
        System.out.println("Good morning");
    }
    void greet2() {
        System.out.println("Good afternoon");
    }
}
abstract class Child3 extends Parent2{
    void time(){
        System.out.println("Its noon");
    }
}
public class abstractClass {
    public static void main(String[] args){
        //error Parent2 p=new Parent2(); abstract class cannot be instantiated
        Child2 c=new Child2(); //concrete class as all the methods of parent class are overridden
        c.greet();
        c.greet2();
        //errorChild3 ch=new Child3();
    }
}
