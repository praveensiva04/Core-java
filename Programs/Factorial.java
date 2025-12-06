public class Factorial {
    
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Factorial of the given number is "+fact(a));
        
    }
    public static int fact(int n)
    
    {
        int fact = 1;

        for(int i =1;i<=n;i++)
        {
            fact = fact * i;
            
        }   
        return fact;
    }
}
