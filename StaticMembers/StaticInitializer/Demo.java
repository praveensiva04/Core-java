package StaticMembers.StaticInitializer;

public class Demo {
    static
    {
        System.out.println("Static Initializer Block Executed");//the static block gets executed when the class is loaded
    }
    static 
    {
        System.out.println("Second Static Initializer Block Executed");
    }
    public static void main(String[] args) {
        System.out.println("Main Method Executed");
    }
}
