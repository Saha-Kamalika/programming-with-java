package com.codewithHarry.shape;
import java.util.Scanner;
class Shape{
     double radius;
    double height;
     void setRadius(double r){
        radius=r;
    }
    void setHeight(double h){
        height=h;
    }
}
class Rectangle extends Shape{
       
        public double surfaceArea(double radius){
            return radius*radius;
        }
}
class Cylinder extends Shape{
    public double surfaceArea(double radius,double height){
        return (2*3.14*radius*height)+(2*3.14*radius*radius);
    }
    public double volume(double radius,double height){
        return (3.14*radius*radius*height);
    }
}
public class Shapes{
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        r.setRadius(2.0);
        r.surfaceArea(2.0);
        Cylinder c=new Cylinder();
        c.setRadius(2.0);
        c.setHeight(4.0);
        c.surfaceArea(2.0,4.0);

    }
}

