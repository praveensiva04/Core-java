public class NonParameterized
{
    public static void main(String[] args) {
        System.out.println("Hello Friends");
        greet();
        greet();
        greet();
        int r = add();
        System.out.println("Addition of two numbers : "+add());
        System.out.println("Addition of two numbers : "+r);
        
    }
    public static void greet()
    {
        System.out.println("Welcome to Java Programming");

    }
    public static int add()
    {
        int a = 10;
        int b = 45;
        int sum  = a+b;
        return sum;
    }


}