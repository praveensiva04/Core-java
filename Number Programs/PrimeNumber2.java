class PrimeNumber2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n=10;
		Prime(100 );
	}
	public static void Prime(int n)
	{

		for (int i=2;i<=n ;i++ )
		{
			int count=0;
			for (int j=1;j<=i;j++ )
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if (count<=2)
			{
				System.out.print(i+" ");
			}
		}
	}
}
