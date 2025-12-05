class BankAccount{
	private	double Balance;
	private long Pin;

	BankAccount(double Balance,long Pin)
	{
        setbal(Balance);
        setpin(Pin);
	}
	public void getbal()
	{
		// return Balance;
        System.out.println("Balance : "+Balance);
	}
	public void setbal(double Balance)
	{
		this.Balance=Balance;
	}
	public void getpin()
    {
        // return Pin;
        System.out.println("Pin : "+Pin);
    }
    public void setpin(long Pin)
    {
        this.Pin=Pin;
    }
}
class Bank{
    public static void main(String[] args)
    {
        BankAccount b=new BankAccount(78000,9565);
        b.getbal();
        b.getpin();
    }
}
