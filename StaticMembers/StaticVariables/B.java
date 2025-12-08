package StaticMembers.StaticVariables;

public class B {
    static int a=100;//It is an static global variable, The variable which is prefixed with static keyword or modifier is known as static variable.
    static int b=200;
    public static void main(String[] args) {
        int a=20,b=30;//it is local variable
        System.out.println("Local a: "+a);
        System.out.println("Local b: "+b);
        //call static variables by help of class name reference
        System.out.println("Static a: "+B.a);
        System.out.println("Static b: "+B.b);
    }
}
