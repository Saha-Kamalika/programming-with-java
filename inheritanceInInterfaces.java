interface sampleClass{
    void meth1();
    void meth2();
}
interface childSampleClass extends sampleClass{
    void meth3();
    void meth4();
}
class myClass implements childSampleClass{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class inheritanceInInterfaces {
    public static void main(String[] args)
    {
        myClass ob=new myClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
        ob.meth4();
    }
}
