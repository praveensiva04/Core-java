package Constructor.UserDefinedConstructor.NonParameterized;

public class Demo {
    int x=200;//non-static variable
    static int y=300;//static variable
    Demo()//non parameterized user-defined constructor
    {
        int a=131;
        System.out.println("X :"+x);
        System.out.println("y :"+y);
        System.out.println("a :"+a);
    }
    public static void main(String[] args) 
    {
        
        Demo d=new Demo();
        //no need to call the variable name with class object reference
        Demo d1=new Demo();
    }
}
