class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n=11;
		if(Prime(n))
		{
			System.out.println("Prime");	
		}
		else
		{
			
			System.out.println("Not Prime");
		}
	}
	public static boolean Prime(int n)
	{
		//if(n==1)
		//{
		//	System.out.println("it is prime number");
		//}
		//else if(n
		int count=0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count+=1;
			}
		}
		return count==1;
		
	}
}
