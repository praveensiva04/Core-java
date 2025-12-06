class SpyNumber
{
	public static void main(String[] args) 
	{
		int n = 132;
		System.out.println("number :"+n);
		Spy(n);
	}
	public static void Spy(int n)
	{
		int prod=1;
		int sum=0;
		int lastd=0;
		int temp=n;
		while(n!=0)
		{
			lastd=n%10;
			prod*=lastd;
			sum+=lastd;
			n/=10;
		}
		if(sum==prod)
		{
			System.out.println("The given number is Spy number");
		}
		else
		{
			System.out.println("The given number is Not a Spy number");
		}
	}
}
