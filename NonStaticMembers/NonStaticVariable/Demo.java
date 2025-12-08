package NonStaticMembers.NonStaticVariable;

public class Demo {
    int a=100;
    int b=200;
    public static void main(String[] args) {
        // System.out.println(a);//Compile Time Error
        // System.out.println(b);//Compile Time Error

        //Non-static members cannot be accessed directly inside static context
        //we should create the object reference for the class to access non-static members
        
        Demo d1=new Demo();
        System.out.println(d1.a);
        System.out.println(d1.b);
    }
}
