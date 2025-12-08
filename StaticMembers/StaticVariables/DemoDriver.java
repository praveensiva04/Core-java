package StaticMembers.StaticVariables;
class Demo
{
    static int x;
}
public class DemoDriver {
    public static void main(String[] args) {
        //Access static variable by help of class name.
        Demo.x=55;
        System.out.println("Value of x: "+Demo.x);
        Demo.x=200;//Modify static variable by help of class name.
        System.out.println("Modified Value of x: "+Demo.x);
        //static variable is an single copy execution of program.
        System.out.println(Demo.x);
    }
}
