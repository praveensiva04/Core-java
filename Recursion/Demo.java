package Recursion;

public class Demo {
    public static void main(String[] args) {
        int n=1;
        RecursionDemo(n);
    }
    public static void RecursionDemo(int n) {
        if(n<=10)
        {
            System.out.println(n);
            RecursionDemo(n+1);
        }
        // System.out.println("End of Function");
    }
}
