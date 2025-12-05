package StaticExample;

public class StaticBlock {
    static int a = 3;
    static int b;
    
    static{
        System.out.println("Static block");
        b=a+5;

    }
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.b+" "+StaticBlock.a);

        StaticBlock.a+=2;
        System.out.println(StaticBlock.b+" "+StaticBlock.a);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.b+" "+StaticBlock.a);

    }
}
