package classFiles;
class MyFinally{
    public static int cal(){
        try {
            int a = 10;
            int b = 0;
            return a / b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is the finally block");
        }
        return -1;
    }
}
public class finalllly {
    public static void main(String[] args)
    {
        MyFinally m=new MyFinally();
        int c=m.cal();
        System.out.println(c);
    }
}
