package Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box()
    {
        this.h=-1;
        this.l=-1;
        this.w=-1;
        System.out.println("Default Constructor");

    }

    Box(double side)
    {
        this.h=side;
        this.l=side;
        this.w=side;
        System.out.println("Side constructor");
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
        System.out.println(this.l+" "+this.h+" "+this.w);
        System.out.println("l,h,w constructor");
    }
    Box(Box old)
    {
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
        System.out.println("Box old Constructor");
    }

    
}
