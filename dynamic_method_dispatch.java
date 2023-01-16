class Phone{
    public void showTime(){
        System.out.println("It is 7 pm now");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on Smart Phone...");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args)
    {
        Phone p=new Phone();
        SmartPhone sp=new SmartPhone();
        Phone p1=new SmartPhone();
        p1.on();
        //p1.music(); methods of subclass can't be accessed only overridden methods can be accessed
        //SmartPhone sp1=new Phone(); subclass referencing not allowed from superclass object
    }
}
