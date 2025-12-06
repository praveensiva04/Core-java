class PerfectNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Perfect(28);
		
	}
	public static void Perfect(int n)
	{
		int sum = 0;
		for (int i=1;i<n;i++ )
		{
			if(n%i==0)
			{
				sum+=i;	
			}
		}
		if (n==sum)
		{
			System.out.println("The given number is perfect number");
		}
		else
		{

			System.out.println("The given number is not a perfect number");
		}
	}
}
