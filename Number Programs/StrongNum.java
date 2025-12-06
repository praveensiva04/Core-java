class StrongNum 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n=145;
		if(Strong(n))
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
	}
	public static boolean Strong(int n)
	{
		int temp = n;
		
		int sum=0;
		while(temp!=0)
		{
			int fact = 1;
			int lastd=temp%10;
			for (int i=1;i<=lastd ;i++ )
			{
				fact=fact*i;
				
			}
			sum+=fact; 
			temp/=10;
		}
		return sum==n;
	}
}
