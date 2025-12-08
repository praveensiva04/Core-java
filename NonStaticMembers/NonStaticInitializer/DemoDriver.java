package NonStaticMembers.NonStaticInitializer;
class Demo
{
    {
        System.out.println("Non-static initializer block");
    }
    {
        System.out.println("Second non-static initializer block");
    }
}
public class DemoDriver {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
    }
}
