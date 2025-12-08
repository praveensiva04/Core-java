package StaticMembers.StaticMethod;

class Demo
{
    static public void sm1()
    {
        System.out.println("Static Method 1");
        sm2();
    }
    static void sm2()
    {
        System.out.println("Static Method 2");
    }
}
public class DemoDriver {
    public static void main(String[] args) {
        Demo.sm1();
        Demo.sm2();
    }
}
