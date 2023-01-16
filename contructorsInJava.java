class Base{
            Base()
            {
                System.out.println("I am the base class constructor with no arguments");
            }
            Base(int x)
            {
                System.out.println("I am the base class constructors with a single argument\nThe value of x is "+x);
            }
        }
        class Derived extends Base{
            Derived()
            {
                System.out.println("I am the derived class constructor with no arguments");
            }
            Derived(int x,int y)
            {
                super(x);
                System.out.println("I am the derived class constructors with two argument\nThe value of y is "+y);
            }
        }
        class childOfDerived extends Derived{
            childOfDerived()
            {
                System.out.println("I am the child of derived class constructor with no arguments");
            }
            childOfDerived(int x,int y,int z)
            {
                super(x,y);
                System.out.println("I am the child of derived class constructors with three argument\nThe value of z is "+z);
            }
        }
public class contructorsInJava {


    public static void main(String[] args)
    {
        childOfDerived c=new childOfDerived(12,13,14);
    }
}
