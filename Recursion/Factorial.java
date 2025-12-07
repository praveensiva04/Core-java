package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int result=Fact(n);
        System.out.println("Factorial of "+n+" is: "+result);
    }
    public static int Fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*Fact(n-1);
    }
}
