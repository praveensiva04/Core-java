public class Fibonacci {
    public static void main(String[] args) {
		int n = 10;
		System.out.println(fibo(n));
    }
	public static int fibo(int n)
	{
		int n1=0,n2=1,sum=0;
		for(int i=2;i<=n;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		return n2;
		
	}
	
	
}
