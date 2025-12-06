class Palindrome 
{
	public static void main(String[] args) 
	{
		int n = 1221;
		if(Pali(n))
		{
			System.out.println("The given number is palindrom");
		}
		else
		{
			System.out.println("the given number is not a palindrome");
			
		}
	}
	public static boolean Pali(int n)
	{
		int rev=0,temp=n;
		while(temp!=0)
		{
			int rem=temp%10;
			rev = rev*10+rem;
			temp/=10;
		}
		return n==rev;
	}
	
}
