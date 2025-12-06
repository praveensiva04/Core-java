class XylemPhloem 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		if (Xp(12225)) {
			System.out.println("Xylem");
		}
		else
		{
			System.out.println("Phloem");
		}
	}
	
	public static boolean Xp(int n)
	{
		int temp=n,out=0,in=0;
		while (temp>0)
		{
			if(n==temp||temp<10)
			{
				out=out+temp%10;
				
			}
			else
			{
				in=in+temp%10;	
			}
			temp=temp/10;
		}
		return out==in;
	}
}
