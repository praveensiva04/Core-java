public class ArmStrongNum2 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        for(int i=1;i<=5000;i++)
        {
            if(ArmStrong(i))
            {
                System.out.println("Armstrong Number"+i);
            }
            // else
            // {
            //         System.out.println("Not a Armstrong Number"+i);
            // }
        }
    }
    public static boolean ArmStrong(int n)
    {
        int temp1=n,temp2=n,sum=0,count=0;
        while(temp1>0)
        {
            count++;
            temp1/=10;
        }
        while(temp2>0)
        {
            int rem=temp2%10;
            int pow=1;
            for(int i=1;i<=count;i++)
            {
                pow*=rem;

            }
            sum+=pow;
            temp2/=10;
        }
        return sum==n;
    }
}
