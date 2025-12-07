package Recursion;

public class Fibonacci {
    
    public static void main(String[] args) {
        int n=5;
        System.out.println("Fibonacci Series of "+n+"th:"+FibonacciSeries(n));
    }
    public static int FibonacciSeries(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return FibonacciSeries(n-1)+FibonacciSeries(n-2);
    }
}
