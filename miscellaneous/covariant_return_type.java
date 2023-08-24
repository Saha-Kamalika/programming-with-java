import java.util.*;
class a1{
    a1 func(){
        return this;
    }
    void print() {
        System.out.println("This is class a1 method");
    }
}
class a2 extends a1{
    @Override
    a2 func(){
        return this;
    }
    @Override
    void print() {
        System.out.println("This is class a2 method");
    }
}
class a3 extends a1{
    @Override
    a3 func(){
        return this;
    }
    @Override
    void print(){
        System.out.println("This is class a3 method");
    }
}
class Covariant{
    public static void main(String[] args){
        a1 a=new a1();
        a.func().print();
        a2 b=new a2();
        b.func().print();
        a3 c=new a3();
        c.func().print();
    }
}
