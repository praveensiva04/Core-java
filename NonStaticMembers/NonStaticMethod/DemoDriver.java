package NonStaticMembers.NonStaticMethod;
class Demo
{
    public void Demo1()
    {
        System.out.println("Demo1 method");
    }
    public void Demo2()
    {
        System.out.println("Demo2 method");
    }
}
public class DemoDriver {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.Demo1();
        d1.Demo2();
    }
}
