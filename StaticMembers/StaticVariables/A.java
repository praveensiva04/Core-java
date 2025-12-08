package StaticMembers.StaticVariables;

public class A {
    static int a;
    public static void main(String[] args) {
        System.out.println(a); // Accessing static variable without creating an object
        a = 25; // Modifying static variable
        System.out.println(a); // Accessing modified static variable
    }
}
