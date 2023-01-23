import java.util.Scanner;
class cylinder{
    public cylinder(){
        this.radius=1;
        this.height=1;
    }
    public cylinder(int h,int r)
    {
        this.radius=r;
        this.height=h;
    }
    float radius,height;
    final float pi= 3.14F;
    Scanner sc=new Scanner(System.in);
    public void setRad(){
        System.out.println("Enter radius of the cylinder(in cm): ");
        radius=sc.nextFloat();
    }
    public void setHt(){
        System.out.println("Enter height of the cylinder(in cm): ");
        height=sc.nextFloat();
    }
    public float getRad()
    {
        return radius;
    }
    public float getHt()
    {
        return height;
    }
    public float surfaceArea()
    {
        return (2*pi*radius*height)+(2*pi*radius*radius);
    }
    public float volume()
    {
        return (pi*radius*radius*height);
    }
}
public class prac_set9 {
    public static void main(String[] args) {
        cylinder c=new cylinder(12,9);
        //c.setRad();
        //c.setHt();
        System.out.println("Radius = "+c.getRad()+" cm");
        System.out.println("Height = "+c.getHt()+" cm");
        System.out.println("Surface Area = "+c.surfaceArea()+" sq.cm");
        System.out.println("Volume = "+c.volume()+" cube cm");
    }
}
