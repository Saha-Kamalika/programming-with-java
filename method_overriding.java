class Parent{
    public void meth1(){
        System.out.println("I am method 1 of class parent");
    }
}
class Child extends Parent{
    public void meth1(){
        System.out.println("I am method 1 of class child");
    }
}
public class method_overriding {
    public static void main(String[] args){
    Parent p=new Parent();
    p.meth1();
    Child c=new Child();
    c.meth1();
}
}
