class PrimeNumber3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		for(int i=2;i<=50;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}	
		}
	}
	public static boolean isPrime(int n)
	{
		if (n<2) {
			return false;
		}
		for(int j=2;j<=n/2;j++)
		{
			if(n%j==0)
			{
				return false;
			}
		}
		return true;
	}
}
