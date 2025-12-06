public class Reverse {
    public static void main(String[] args) {
        int n = 1453;
        System.out.println("Actual Number : "+n);
		System.out.println("Reversed Number : "+reverse(n));
    }
    public static int reverse(int n)
	{
		int rev =0;
		int temp = n;
		while(temp!=0)
		{
			int rem = temp%10;
			rev = rev*10+rem;
			temp/=10;
		}
		return rev;
	}
}
