class HappyNum 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		if(Happy(19))
		{
			System.out.println("Happy Number");
		}
		else
		{
			System.out.println("Not a Happy Number");
		}
	}
	public static boolean Happy(int n)
	{
		
		int temp=n;
		while(temp!=1 && temp!=4)
		{
			int sum=0;
			while(temp!=0)
			{	
				int rem = temp%10;
				sum=sum+rem*rem;
				temp/=10;
			}
			temp=sum;
		}
		return temp==1;
	}
			
}
