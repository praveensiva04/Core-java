class NeonNumbers 
{
	public static void main(String[] args) 
	{
		System.out.println("--------Neon_Number----------");
		Neon(9);
	}
	public static void Neon(int n)
	{
		int num=n;
		int sq=n*n;
		int sum=0;
		int lastd=1;
		while(sq!=0)
		{
				
				lastd=sq%10;
				sum+=lastd;
				sq/=10;
				// n/=10;

				
		}
		// System.out.println(sq+" "+sum);
		// int num=n;
		// int sq=n*n;
		// int lastd=0;
		// int sum=0;
		// while(sq!=0)
		// {
		// 	lastd=sq%10;
		// 	sum+=lastd;
		// 	sq/=10;
		// }
		if(sum==num)
		{
			System.out.println("The given number is Neon number");
		}
		else
		{
			System.out.println("The given number is Not a Neon number");
		}

	}
}
