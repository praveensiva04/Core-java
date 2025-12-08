package MethodOverloading;

public class Demo {
    
    public static void main(String[] ks)
    {
        Display();
        Display(10,20);
        Display(21.4,43.5);
        Display(85,40.4);
    }
    public static void Display()
    {
        System.out.println("Method with No Parameters");
    }
    public static void Display(int a,int b)
    {
        System.out.println("Integer Parameters: "+(a+b));
    }
    public static void Display(double a,double b)
    {
        System.out.println("Double Parameters: "+(a+b));
    }
    public static void Display(int a,double b)
    {
        System.out.println("Mixed Parameters: "+a+" "+b);
    }
}
