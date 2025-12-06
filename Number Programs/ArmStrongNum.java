class ArmStrongNum 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		if(ArmStrong(153))
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
	}
	public static boolean ArmStrong(int n)
	{
		int	sum=0;
		int temp=n;
		while(temp>0)
		{
			int rem=temp%10;
			int count = 1;
			for(int i=1;i<=3;i++)
			{
				count*=rem;
			}
			sum=sum+count;
			temp/=10;
		}
		return sum==n;
	}
}
